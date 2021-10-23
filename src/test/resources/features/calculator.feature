@non_ui @calculator
Feature: Calculator Feature

  As a user, I should be able to use the calculator,
  so that I can do arithmetic operations

  Background:
    Given calculator app is open

  Scenario: Add 2 numbers
    When I add 2 with 2
    Then I should get result 4 displayed

  Scenario: Add 2 numbers
    When I add 5 with 4
    Then I should get result 9 displayed

  Scenario: Add 2 numbers
    When I add 25 with 35
    Then I should get result 60 displayed

  Scenario Outline: Add two numbers with multiple examples
    When I add <num1> with <num2>
    Then I should get result <expectedResult> displayed
    Examples:
      | num1 | num2 | expectedResult |
      | 5    | 4    | 9              |
      | 210  | 90   | 300            |
      | 240  | 240  | 480            |
      | 1000 | 720  | 1720           |
