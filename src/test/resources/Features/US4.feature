Feature: Vehicle Contract Page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline:US4AC1TC1 Verify sales manager and store manager can access Vehicle Contract Page
    Given the user logged in as "<userType>"
    When the user navigates to "<tab>" - "<module>"
    Then the title contains "<title>"
    Then the page url is "<url>"

    Examples:
      | userType      | tab   | module             | title                                                                | url                                                          |
      | sales manager | Fleet | Vehicle Contracts  | All - Vehicle Contract - Entities - System - Car - Entities - System | https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract |
      | store manager | Fleet | Vehicle Contracts | All - Vehicle Contract - Entities - System - Car - Entities - System | https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract |


  Scenario:US4AC1TC2 Verify driver can not access Vehicle Contract Page
    Given the user logged in as "driver"
    When the user navigates to "Fleet" - "Vehicle Contracts"
    Then the user should see "You do not have permission to perform this action." message


