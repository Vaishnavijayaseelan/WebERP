Feature: WebERP Homepage Functionality

  Scenario: WebERP Homepage scenario
    Given user is on homepage
    When user title of homepage is webERP - Main Menu
    Then user clicks on the sales button
    Then user verify the Transactions list
    And user verify the Inquiries and Reports list
    Then user return to home page
