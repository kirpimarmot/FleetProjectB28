Feature: Pinbar

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US3AC1TC1 Verify user can use how to use the pinbar
    Given the user logged in as "sales manager"
    And the user click on the "Learn how to use this space" link
    Then the user should see following text
      | How To Use Pinbar                                                                      |
      | Use pin icon on the right top corner of page to create fast access link in the pinbar. |
    Then the users should see an image on the page