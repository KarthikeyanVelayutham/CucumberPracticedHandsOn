Feature: signing in to HRM
  Scenario: signing into HRM Homepage
    Given the user is entering into the HRM login page
        When user enter valid id and password as "Admin" and valid "admin123"
        And click on the login button
          Then orange HRM page will be displayed