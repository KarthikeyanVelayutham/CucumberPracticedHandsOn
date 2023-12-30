Feature: this is the login features for orange HRM
  Scenario Outline: This is login scenario for HRM
    Given proceed to login page
        When user enters the "<username>" and "<password>"
        And click login button in HRM loginpage
          Then you should see the orangeHRMHome
        Examples:
        |username|password|
        |Admin|admin123|
        |Admin|admin12|
    