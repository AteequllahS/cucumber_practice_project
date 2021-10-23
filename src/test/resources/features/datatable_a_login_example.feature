@ui @datatable
Feature: logging in the weborder page

  as, I user I should be able to login with valid credentials

  Scenario: Login to weborder app by giving username and password in column table
    Given we are web order login page_for datatable example
    When we provide the following table data_for datatable example
      | username | Test   |
      | password | tester |
    Then we should see all order page_for datable example

  Scenario: representing table with header and more than 2 columns with list of map

    Given this the products reference with header
      | Product     | Price | Discount |
      | MyMoney     | 100   | 0.08     |
      | FamilyAlbum | 80    | 0.15     |
      | ScreenSaver | 20    | 0.1      |

    Then I also provide that table with no header
      | MyMoney     | 100   | 0.08     |
      | FamilyAlbum | 80    | 0.15     |
      | ScreenSaver | 20    | 0.1      |