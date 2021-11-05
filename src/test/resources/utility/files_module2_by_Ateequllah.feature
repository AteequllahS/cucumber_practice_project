@smoke
Feature: Files Module should work as expected2

  As a user, I should be able to access to Files module2

  Scenario: User can add a file to favorites2
    Given I login as a user2
    When I click action-icon from any file on the page2
    And choose Add to Favorite option2
    And click Favorites sub-module on the list side2
    Then verify the chosen file is listed on the table2
#    #pre condition: there should be at least 1 file is uploaded

