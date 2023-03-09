@INTA-1474
Feature: Default

	Background:
		#@INTA-1422
		Given the user is on the login page
		


	@INTA-1470 @INTA-1473
	Scenario: US1AC1TC1 Verify Menu Options for Driver
		Given the user logged in as "driver"
		    Then the user should see following options
		      | Fleet      |
		      | Customers  |
		      | Activities |
		      | System     |	

	
	@INTA-1471 @INTA-1473
	Scenario:  US2AC1TC1 Verify user access to the Oroinc Documentation page
		Given the user logged in as "sales manager"
		    And the user click on the question icon
		    Then the user should see "Welcome to Oro Documentation"	

	
	@INTA-1472 @INTA-1473
	Scenario: US3AC1TC1 Verify user can use how to use the pinbar
		Given the user logged in as "sales manager"
		    And the user click on the "Learn how to use this space" link
		    Then the user should see following text
		      | How To Use Pinbar                                                                      |
		      | Use pin icon on the right top corner of page to create fast access link in the pinbar. |
		    Then the users should see an image on the page