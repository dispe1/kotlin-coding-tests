# Configuration
SOURCE_DIR = "src/main/kotlin"
REPO_URL_BASE = "https://github.com/dispe1/kotlin-coding-tests/blob/main/"
import os
import re


def get_subdirectories(path):
    return [d for d in os.listdir(path) if os.path.isdir(os.path.join(path, d))]


def get_kotlin_files(path):
    return [f for f in os.listdir(path) if f.endswith(".kt")]


def parse_metadata(file_path):
    """
    Parses the top comments of the Kotlin file to extract metadata.
    Expected format:
    /**
     * <URL>
     * Difficulty: <Difficulty>
     * Score: <Score>
     */
    """
    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()

    match = re.search(r"/\*\*(.*?)\*/", content, re.DOTALL)
    if not match:
        return None, None, None

    comment_block = match.group(1)
    lines = [line.strip().strip("*").strip() for line in comment_block.split("\n")]

    url = None
    difficulty = "Unknown"
    score = None  # Changed from 'Unknown' to None

    for line in lines:
        if line.startswith("http"):
            url = line
        elif line.lower().startswith("difficulty:"):
            difficulty = line.split(":", 1)[1].strip()
        elif line.lower().startswith("score:"):
            score = line.split(":", 1)[1].strip()

    return url, difficulty, score


def count_solutions():
    count = 0
    for root, dirs, files in os.walk(SOURCE_DIR):
        for file in files:
            if file.endswith(".kt"):
                count += 1
    return count


def generate_readme():
    with open("README.md", "w", encoding="utf-8") as readme:
        readme.write("# Kotlin Coding Tests\n\n")
        readme.write(
            f"This repository contains {count_solutions()} solutions to coding practice problems (Codility, HackerRank, LeetCode) implemented in Kotlin.\n\n"
        )
        readme.write("If it was helpful please press a star.\n\n")

        readme.write(
            "[![GitHub last commit](https://img.shields.io/github/last-commit/dispe1/kotlin-coding-tests.svg)](https://github.com/dispe1/kotlin-coding-tests)\n"
        )
        readme.write(
            "[![GitHub commit activity](https://img.shields.io/github/commit-activity/y/dispe1/kotlin-coding-tests.svg)](https://github.com/dispe1/kotlin-coding-tests)\n"
        )
        readme.write(
            "[![GitHub repo size](https://img.shields.io/github/repo-size/dispe1/kotlin-coding-tests.svg)](https://github.com/dispe1/kotlin-coding-tests)\n"
        )
        readme.write(
            "[![GitHub stars](https://img.shields.io/github/stars/dispe1/kotlin-coding-tests.svg)](https://github.com/dispe1/kotlin-coding-tests)\n\n"
        )

        platforms = sorted(get_subdirectories(SOURCE_DIR))

        for platform in platforms:
            platform_path = os.path.join(SOURCE_DIR, platform)
            readme.write(f"- {platform.capitalize()}\n")

            categories = sorted(get_subdirectories(platform_path))
            for category in categories:
                display_category = category.capitalize()
                if category.startswith("lesson"):
                    display_category = category.replace("lesson", "Lesson ")

                readme.write(f"    - {display_category}\n")

                category_path = os.path.join(platform_path, category)
                files = sorted(get_kotlin_files(category_path))

                for file in files:
                    file_path = os.path.join(category_path, file)
                    url, difficulty, score = parse_metadata(file_path)

                    if not url:
                        continue

                    solution_name = file.replace(".kt", "")
                    display_name = re.sub(r"(\w)([A-Z])", r"\1 \2", solution_name)

                    relative_path = os.path.join(
                        SOURCE_DIR, platform, category, file
                    ).replace("\\", "/")
                    solution_url = REPO_URL_BASE + relative_path.replace(" ", "%20")

                    # Only append score if it exists
                    score_str = f" | Score: {score}" if score else ""

                    readme.write(
                        f"        - {display_name} | [Problem]({url}) | [Solution]({solution_url}) | Difficulty: {difficulty}{score_str}\n"
                    )


if __name__ == "__main__":
    generate_readme()
    print("README.md has been generated.")
