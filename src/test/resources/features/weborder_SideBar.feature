
Feature: Side bar at web order page should work as expected
  As a user, I should be able to login to web order app

  Background:
    Given we are at login page
    When we provide valid user "Tester" and password "test"


  Scenario Outline: SideBar Modules
    Given we are at web order page
    When we select any tab from sidebar "<sidebar>"
    Then we should be at each selected tab page "<tabPage>"

    Examples:
      | sidebar           | tabPage            |
      | View all orders   | List of All Orders |
      | View all products | List of Products   |
      | Order             | Order              |

  Scenario Outline: Order Page
    Given we are at web order page
    When we select "Order" from sidebar
    Then we should see below "<options>" in Product Dropdown list
    Examples:
      | options     |
      | MyMoney     |
      | FamilyAlbum |
      | ScreenSaver |
