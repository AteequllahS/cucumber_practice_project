@ui #@wip
Feature: Logging into Library Web

  As a user, I should be able to login into library app

  Scenario Outline: Login with valid credentials

    Given user is at library login page
    When user uses username "<email>" and password "<password>"
    Then user should be at Dashboard page

    Examples:
      | email               | password  |
      | student42@library   | Sdet2022* |
      | student43@library   | Sdet2022* |
      | student44@library   | Sdet2022* |
      | librarian54@library | Sdet2022* |
      | librarian15@library | Sdet2022* |
