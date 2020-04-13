Feature: Login functionality scenarios

@Login @1
Scenario: Verify whether the User is able to login with valid credentials
	Given I launch the application
	And I navigate to Account Login page
	When I login to the application using username as "ravi.kiran1@gmail.com" and valid password as "rkiran"
	Then I should see that the User should be able to successfully login
	
	@Login @2
Scenario: Verify that the User is not able to login with invalid credentials
	Given I launch the application
	And I navigate to Account Login page
	When I login to the application using username as "abcd@gmail.com" and valid password as "rkiran"
	#Then I should see an error message "Warning: No match for E-Mail Address and/or Password."

	@Login @3
Scenario: Verify that the User is not able to login without providing credentials
	Given I launch the application
	And I navigate to Account Login page
	When I login to the application using username as "" and valid password as ""
	#Then I should see an error message informing about invalid credentials	

@Login @4	
Scenario: Verify whether User is able to reset his forgoten password
 Given I launch the application
And I navigate to Account Login page
 When I reset the forgoten password for the email address "ravi.kiran@gmail.com"
Then I should see a message "An email with a confirmation link has been sent your email address."
