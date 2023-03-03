
Feature: Oroinc page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US2AC1TC1 Verify user access to the Oroinc Documentation page
    Given the user logged in as "sales manager"
    And the user click on the question icon
    Then the user should see "Welcome to Oro Documentation"