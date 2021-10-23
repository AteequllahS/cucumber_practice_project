@non_ui @eating_cucumber
Feature: Eating too many cucumbers may not be good for you
  eating too much of anything may not be good for you.

  Scenario: Eating a few is no problem
    Given Alice is hungry
    When she eats "3" cucumbers
    Then she will be full


  Scenario: Eating a few is no problem
    Given Melisa is hungry
    When she eats "10" cucumbers
    Then she faints

  Scenario Outline: eating
    Given there are <count> cucumbers
    When I can eat <eat> cucumbers
    Then I should have <left> cucumbers
    Examples:
      | count | eat | left |
      | 12    | 5   | 7    |
      | 15    | 5   | 10   |
      | 3     | 2   | 1    |
      | 2     | 2   | 0    |

