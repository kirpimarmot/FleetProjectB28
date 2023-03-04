Feature: Calender Events Page- Create Recurring Events

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US8AC1TC1 Verify repeat number is 1 by default under recurring events
    Given the user logged in as "sales manager"
    When the user navigates to "Activities" - "Calendar Events"
    And the user click on Create Calendar Event button
    And the user click on repeat check box
    Then the repeat number is "1"


  Scenario: US8AC1TC2 Verify error message appears when deleting the repeat number
    Given the user logged in as "sales manager"
    When the user navigates to "Activities" - "Calendar Events"
    And the user click on Create Calendar Event button
    And the user click on repeat check box
    When the calendar event repaet field is cleared
    Then the user should see "This value should not be blank." warning
