Feature: Vehicle Model Page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US5AC1TC1 Verify Column names for Sales Manager
    Given the user logged in as "sales manager"
    When the user navigates to "Fleet" - "Vehicles Model"
    Then the user should see following column options
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |


  Scenario:US5AC1TC2 Verify driver can not access Vehicle Contract Page
    Given the user logged in as "driver"
    When the user navigates to "Fleet" - "Vehicles Model"
    Then the user should see "You do not have permission to perform this action." message