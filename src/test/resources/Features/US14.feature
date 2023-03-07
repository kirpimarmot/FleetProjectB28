Feature: As a user, I want to manage filters on the Marketing page.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US14AC1TC1 Verify all check boxes are checked by default
    Given the user logged in as "sales manager"
    When the user navigates to "Marketing" - "Campaigns"
    And the user clicks on filter button
    Then the user clicks on manage filter button
    And filter options are checked by default


  Scenario: US14AC1TC2 Verify check boxes can be unchecked
    Given the user logged in as "sales manager"
    When the user navigates to "Marketing" - "Campaigns"
    And the user clicks on filter button
    Then the user clicks on manage filter button
    And filter options can be unchecked