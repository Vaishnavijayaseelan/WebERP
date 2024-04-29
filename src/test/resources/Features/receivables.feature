Feature: Validate the Receivables Functionality

  Background: 
    Given user has already logged into application
      | username | password |
      | Admin    | weberp   |

  Scenario: WebERP receivables link check
    Given user already clicked on the Receivables link
    Then user validate the Transactions list under Receivables
    Then user validate the Inquiries and Reports list under Receivables
    And user validate the Maintenance list under Receivables
    Then user clicks on Purchases
