# Addition Application

This Java application provides a method to perform addition on two positive integers. It includes error handling for invalid inputs such as negative integers or non-integer inputs.

## Requirements

- Java 8 or higher
- JUnit 4 (for running tests)

## Installation

Clone the repository to your local machine:

```bash
git clone https://github.com/your-username/addition-application.git
```

## Usage

Compile the Java files:

```bash
javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar Addition.java AdditionTest.java
```

Run the tests:

```bash
java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore AdditionTest
```

## Test Cases

- **Case 1:** When adding 2 integers where one of them is negative, an error message should be displayed.
- **Case 2:** When adding 2 positive integers, the accurate result of the addition of the 2 inputs should be displayed.
- **Case 3:** When adding 2 inputs where one of them (or both) are not integers, an error message should be displayed.
