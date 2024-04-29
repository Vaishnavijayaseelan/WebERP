Feature: Validate the General Ledger Functionality

  Background: 
    Given user has already logged into application
      | username | password |
      | Admin    | weberp   |

  Scenario: WebERP General Ledger link check
    Given user already clicked on General Ledger link
    When user verify the Transactions list under General Ledger
    Then user verify the Inquiries and Reports list under General Ledger
    And user verify the Maintenance list under General Ledger
    Then user clicks on Asset Manager
