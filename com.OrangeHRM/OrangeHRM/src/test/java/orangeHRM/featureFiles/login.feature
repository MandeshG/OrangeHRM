Feature: Login to the Application 
	Exisiting  User should be able to login into account using correct credentials

Scenario: Log into the account using correct credentials 
	Given User login to the application 
	And User enter the username 
	And User enter the password 
	When User clicks on the Login Button 
	Then user is able to login to the application  