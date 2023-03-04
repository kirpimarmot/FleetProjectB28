Feature: Vehicles Page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US6AC1TC1 Verify user can see view, edit, delete icons
    Given the user logged in as "sales manager"
    When the user navigates to "Fleet" - "Vehicles"
    When The user hover over the three dots at the end of any row
    Then the user see following icons
      | View   |
      | Edit   |
      | Delete |