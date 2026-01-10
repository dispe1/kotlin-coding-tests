# Kotlin Coding Tests

Solutions to coding practice problems from various platforms, implemented in Kotlin.

## Project Structure

This project follows a standard Gradle layout with Kotlin DSL.

```text
src/
├── main/kotlin/
│   ├── codility/     # Codility solutions
│   ├── hackerrank/   # HackerRank solutions (organized by topic)
│   └── leetcode/     # LeetCode solutions
└── test/kotlin/      # Unit tests corresponding to the solutions
```

## How to Run

### Prerequisites
- JDK 11 or higher
- IntelliJ IDEA (Recommended) or CLI

### Running Tests
You can run all tests using the Gradle wrapper:

```bash
./gradlew test
```

## Adding a New Solution

1.  Create a Kotlin file in the appropriate package under `src/main/kotlin/`.
    -   Example: `src/main/kotlin/hackerrank/algorithms/warmup/SolveMeFirst.kt`
2.  Create a corresponding test file in `src/test/kotlin/`.
    -   Example: `src/test/kotlin/hackerrank/algorithms/warmup/SolveMeFirstTest.kt`
3.  Implement the solution and the test cases.
4.  Run the test to verify.

## References
- [Original Python Solutions](https://github.com/dispe1/Hackerrank-Solutions)
