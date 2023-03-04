Feature: Vehicle Odometer Page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline:US11AC1TC1 Verify sales manager and store manager can not access Vehicle Odometer Page
    Given the user logged in as "<userType>"
    When the user navigates to "<tab>" - "<module>"
    Then the user should see "<warning>" message

    Examples:
      | userType      | tab   | module           | warning                                            |
      | sales manager | Fleet | Vehicle Odometer | You do not have permission to perform this action. |
      | store manager | Fleet | Vehicle Odometer | You do not have permission to perform this action. |



  Scenario:US11AC1TC2 Verify driver see default page as 1 and view per page 25
    Given the user logged in as "driver"
    When the user navigates to "Fleet" - "Vehicle Odometer"
    And the default page number is "1"
    Then The default value of View Per Page is "25"

