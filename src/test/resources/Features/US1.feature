
Feature: As a user, I should be accessing all the main modules of the app.

  Background: User is already in the log in page
    Given the user is on the login page

@smoke @INTA-1470 @INTA-1474
  Scenario: US1AC1TC1 Verify Menu Options for Driver
    Given the user logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: US1AC1TC2 Verify Menu Options for Sales Manager
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |




#  Scenario Outline: Verify login with different user types
#    Given the user logged in as "<userType>"
#    Then The user is on the "<pageSubTitle>" page
#
#    Examples:
#      | userType      | pageSubTitle    |
#      | Driver        | Quick Launchpad |
#      | Sales Manager | Dashboard       |
#      | Store Manager | Dashboard       |









