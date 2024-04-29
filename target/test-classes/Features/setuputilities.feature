Feature: Validate the Setup/Utilities Functionality

  Background: 
    Given user has already logged into application
      | username | password |
      | Admin    | weberp   |

  Scenario: WebERP Setup/Utilities link check
    Given user already clicked on Setup link
    When user verify the General Setup Options
    Then user verify the Receivables or Payables Setup
    And user verify the Inventory Setup
    Then user clicks on Utilities
    Then user verify the Transactions list under Utilities
    Then user verify the Inquiries and Reports list under Utilities
    And user verify the Maintenance list under Utilities
    Then user logged Out the application
