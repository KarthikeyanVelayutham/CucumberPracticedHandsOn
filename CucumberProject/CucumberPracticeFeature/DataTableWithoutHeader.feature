Feature: this is the login feature for orange HRM
  Scenario: login to the HRM Homepage
    Given you are on the HRM login page
        When you enter below credentials
        |Admin|admin123|
        And click the login button
          Then you should see the homepage