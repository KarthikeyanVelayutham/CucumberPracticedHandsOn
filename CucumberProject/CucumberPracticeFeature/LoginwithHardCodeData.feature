@login
Feature: sign in to HRM
  Scenario: sign in to HRM Homepage
    Given the user is in the HRM login page
        When user enters valid name and valid password
        And click on enter
          Then orange HRM page should be displayed