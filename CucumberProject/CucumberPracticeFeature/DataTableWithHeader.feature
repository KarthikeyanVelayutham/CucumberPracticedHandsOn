Feature: this is the login feature for orange HRM
  Scenario: This is login scenario
    Given Go to login page
        When enter the below credentials
        |username|password|
        |Admin|admin123|
        And click login button
          Then you should see the orangeHRMHomepagepage