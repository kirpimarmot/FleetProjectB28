Feature: Vehicles Page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US5AC1TC1 Verify Column names for Sales Manager
    Given the user logged in as "sales manager"
    When the user navigates to "Fleet" - "Vehicles"
    When The user hover over the three dots at the end of any row
    Then the user see following icons
      | View   |
      | Edit   |
      | Delete |