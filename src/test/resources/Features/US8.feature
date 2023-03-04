Feature: Calender Events Page- Create Recurring Events

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US8AC1TC1 Verify all check boxes in the Vehicles page is uncheck by defult
    Given the user logged in as "sales manager"
    When the user navigates to "Activities" - "Calendar Events"
    And the user click on Create Calendar Event button
    Then the repeat number is "1"
