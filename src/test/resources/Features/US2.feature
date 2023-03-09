
Feature: As a user, I should be access to the Oroinc Documentation page. (Window handle)

  Background: User is already in the log in page
    Given the user is on the login page

  @smoke @INTA-1471 @INTA-1474
  Scenario: US2AC1TC1 Verify user access to the Oroinc Documentation page
    Given the user logged in as "sales manager"
    And the user click on the question icon
    Then the user should see "Welcome to Oro Documentation"