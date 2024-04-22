Feature: WebERP login funtionality

  Scenario Outline: WebErp login scenario
    Given user is on login page
    When user title of login page is webERP
    Then user enters "<username>" and user enters "<password>"
    Then user clicks on login button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Admin    | webrep   |
