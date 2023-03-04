Feature: Customers Account Page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US14AC1TC1 Verify all check boxes in the Vehicles page is uncheck by defult
    Given the user logged in as "sales manager"
    When the user navigates to "Customers" - "Accounts"
    And the user clicks on filter button
    Then the user clicks on manage filter button
    And filter options are as follows
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |