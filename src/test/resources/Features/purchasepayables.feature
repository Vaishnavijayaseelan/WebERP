Feature: Validate the Purchase and Payables Functionality

  Background: 
    Given user has already logged into application
      | username | password |
      | Admin    | weberp   |

  Scenario: WebERP Purchase and Payables link check
    Given user already clicked on the Purchase link
    Then user validate the Transactions list under Purchase
    Then user validate the Inquiries and Reports list under Purchase
    And user validate the Maintenance list under Purchase
    Then user clicks on Payables
    Then user validate the Transactions list under Payables
    Then user validate the Inquiries and Reports list under Payables
    And user validate the Maintenance list under Payables
