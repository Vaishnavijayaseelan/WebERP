Feature: Validate the Inventory Functionality

  Background: 
    Given user has already logged into application
      | username | password |
      | Admin    | weberp   |

  Scenario: WebERP Inventory link check
    Given user clicks on the Inventory link
    Then user validate the Transactions list under Inventory
    Then user validate the Inquiries and Reports list under Inventory
    And user validate the Maintenance list under Inventory
    Then user clicks on Manufacturing          
