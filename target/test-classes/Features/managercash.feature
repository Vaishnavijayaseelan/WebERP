Feature: Validate the Asset Manager/Petty Cash Functionality

  Background: 
    Given user has already logged into application
      | username | password |
      | Admin    | weberp   |

  Scenario: WebERP Asset Manager/Petty Cash link check
    Given user already clicked on Asset Manager link
    When user verify the Transactions list under Asset Manager
    Then user verify the Inquiries and Reports list under Asset Manager
    And user verify the Maintenance list under Asset Manager
    Then user clicks on Petty Cash
    Then user verify the Transactions list under Petty Cash
    Then user verify the Inquiries and Reports list under Petty Cash
    And user verify the Maintenance list under Petty Cash
    Then user clicks on Setup
