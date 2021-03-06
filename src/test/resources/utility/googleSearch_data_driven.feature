@smoke
Feature: Google Search Data Driven

  As a user, I should be able to search by keyword
  and get my result for multiple set of data

# mody this to make it data driven scenario that search for multiple keywords
  Scenario Outline: User search by keyword "<keyword>"
    Given user is at home page
    When user search for keyword "<keyword>"
    Then the title should start with "<keyword>"
    Examples:
      | keyword                         |
      | what is cucumber                |
      | how selenium web driver work    |
      | java vs python                  |
      | test automation jobs            |
      | how much a tester is being paid |

