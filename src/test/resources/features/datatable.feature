Feature: Demonstrating the data table feature of cucumber

  Cucumber provides ability to organize repeating steps with  different data using the data table feature
  and automatically convert the table into few known data types supported by cucumber

  Scenario: Books I read
    Given I read "Novels"
    And I read "History"
    And I read "Political Science"
    And I read "Sociology"
    When If I want to find what I read
    Then I just look at their titles

  Scenario: Putting all my books in a table
    Given I have read the following books
      | Novels            |
      | History           |
      | Political Science |
      | Sociology         |

    When I want to look at their titles
      | James Bond                |
      | The History of Slavery    |
      | How Trump could succeed   |
      | Why people tend to Tattoo |

    Then I could say I read the following books from their titles

      | Novels            | James Bond                |
      | History           | The History of Slavery    |
      | Political Science | How Trump could succeed   |
      | Sociology         | Why people tend to Tattoo |

