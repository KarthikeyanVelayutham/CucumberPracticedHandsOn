Feature: sign in to HRM
  Scenario: sign in to HRM Homepage
    Given the user is on the HRM login page
        When user enters valid credentials "Admin" and valid "admin123"
        And click on enter button
          Then orange HRM page must be displayed