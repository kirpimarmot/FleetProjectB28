Feature: As a user, I want to access to Vehicle contracts page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline:US4AC1TC1 Verify sales manager and store manager can access Vehicle Contract Page
    Given the user logged in as "<userType>"
    When the user navigates to "Fleet" - "Vehicle Contracts"
    Then the title contains "<title>"
    Then the page url is "<url>"

    Examples:
      | userType      | title                                                                | url                                                          |
      | sales manager | All - Vehicle Contract - Entities - System - Car - Entities - System | https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract |
      | store manager | All - Vehicle Contract - Entities - System - Car - Entities - System | https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract |


  Scenario:US4AC1TC2 Verify driver can not access Vehicle Contract Page
    Given the user logged in as "driver"
    When the user navigates to "Fleet" - "Vehicle Contracts"
    Then the user should see "You do not have permission to perform this action." message


