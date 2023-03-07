Feature: As a user, I want to manage filters on the Vehicle Costs page. (Web table and checkbox)

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US13AC1TC1 Verify all check boxes in the Vehicles page is uncheck by defult
    Given the user logged in as "sales manager"
    When the user navigates to "Fleet" - "Vehicle Costs"
    Then the user should see following column options
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |


  Scenario: US13AC1TC2 Verify user can select all records by clicking on the first check box
    Given the user logged in as "sales manager"
    And the user navigates to "Fleet" - "Vehicle Costs"
    Then the the user select all records by click on the first check box