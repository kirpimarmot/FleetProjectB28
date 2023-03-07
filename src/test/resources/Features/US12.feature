Feature: As a user, I want to filter customers’ info on the Account page.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US12AC1TC1 Verify filter names of the Customer Account Page
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