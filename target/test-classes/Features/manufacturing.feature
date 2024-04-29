Feature: Validate the Manufacturing Functionality

  Background: 
    Given user has already logged into application
      | username | password |
      | Admin    | weberp   |

  Scenario: WebERP Manufacturing link check
    Given user already clicked on Manufacturing link
    Then user verify the Transactions list under Manufacturing
    Then user verify the Inquiries and Reports list under Manufacturing
    And user verify the Maintenance list under Manufacturing
    Then user clicks on General Ledger
