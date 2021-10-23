@smoke @homework
Feature: Doing homework

  As a student, I want to be able to finish my homework so that I can learn good stuff

  Scenario: Web order product table _ homework
    Given we are at webOrder login page
    And we provide valid credentials to login
    When we select "View all products" tab from sidebar
    Then We should see table with below content

      | Product name | Price | Discount |
      | MyMoney      | $100  | 8%       |
      | FamilyAlbum  | $80   | 15%      |
      | ScreenSaver  | $20   | 10%      |