Feature: Test the Login functionality of OrangeHRM 

Scenario Outline: Test the valid login 
	Given user is on login page 
	When user enters valid <username> and <password> 
	And clicks on login button 
	Then user is navigated to the home page 
	Examples: 
		| username | password |
		| Admin | admin123 |
		| admin1 | admin1234 |