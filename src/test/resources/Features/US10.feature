Feature: As a user, I want to write the “Description” when I create a calendar event. (Iframe)

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US10AC1TC1 Verify repeat number is 1 by default under recurring events
    Given the user logged in as "sales manager"
    When the user navigates to "Activities" - "Calendar Events"
    And the user click on Create Calendar Event button
    And the user write message inside the description field
