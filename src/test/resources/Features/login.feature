
@SmokeFeature
Feature: WebERP login funtionality

@smoketest
  Scenario: WebErp login scenario
    Given user is on login page
    When user title of login page is webERP
    Then user enters the username and user enters the password
    Then user clicks on login button
    Then user is navigated to home page

    
    