Feature: Validate the saleslink Functionality

  Background: 
    Given user has already logged into application
      | username | password |
      | Admin    | weberp   |

  Scenario: WebERP sales link check
    Given user is already on home page
    When user click on the sales link
    Then user validate the Transactions list
    Then user validate the Inquiries and Reports list
    And user validate the Maintenance list
    Then user click on Receivables
