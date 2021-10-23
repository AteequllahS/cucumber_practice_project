@ui
Feature: web order app login
  as a user, I should be able to login to web order app

  Background:
    Given we are at web order login page

  Scenario: User login successfully
    When we provide valid credentials
    Then we should see all order page

  Scenario: User login fail
    When we provide invalid credentials
    Then we should  still be on login page
    And login error message should be present

#=========================================================================

  Scenario: user login with specific credentials

    # whatever is enclosed inside quotation, "" will be sent as parameter value
    When user provide username "Tester" and password "test"
    Then we should see all order page


  Scenario: User login with wrong credentials
    When user provide username "BLA" and password "BLA"
    #these two steps have already been given in previous steps, so it will not create again
    Then we should  still be on login page
    And login error message should be present


