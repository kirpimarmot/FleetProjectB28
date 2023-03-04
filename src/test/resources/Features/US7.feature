Feature: Select Vehicle from Vehicles Page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US7AC1TC1 Verify all check boxes in the Vehicles page is uncheck by defult
    Given the user logged in as "sales manager"
    When the user navigates to "Fleet" - "Vehicles"
    Then the all checkboxes should be unchecked


  Scenario: US7AC1TC2 Verify user can select all cars by clicking on the first check box
    Given the user logged in as "sales manager"
    And the user navigates to "Fleet" - "Vehicles"
    Then the the user select all cars by click on the first check box


  Scenario: US7AC1TC3 Verify user can select all cars by clicking on the first check box
    Given the user logged in as "sales manager"
    And the user navigates to "Fleet" - "Vehicles"
    Then the the user can select any car
