@newFramework1
Feature: Submit data to webdriveruniveristy.com using contact us form

Scenario: Submit valid data via contact us form

Given I access webdriveruniversity contact us form
	When I enter a valid firstname
	When I enter a valided last name
	| woods | jackson | jones |
	And i enter a valid email address 
	And i enter comments
	|example comment one | example comment two |
	When i click on the submit button
	Then the information should be successfully submitted via the contact us form
	