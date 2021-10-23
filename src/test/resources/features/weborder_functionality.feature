
@ui @wip
Feature: Web order should work as expected
  
  As a user the order tab should work as expected
  
  Scenario: user should see all products from sidebar to all available products
    Given we are at webOrder login page
    And we provide valid user and password
    When we select "Order" tab from the sidebar
    Then we should see below options in product dropdown list
      | MyMoney     |
      | FamilyAlbum |
      | ScreenSaver |
