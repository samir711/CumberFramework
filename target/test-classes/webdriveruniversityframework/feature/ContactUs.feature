@Live
Feature: Submit data to webdriveruniversity.com using contact us form
	
	
@Live
Scenario: Submit valid data via contact us form
    Given I access webdriveruniversity
	When I click on the contact us button
	And I enter a valid first name
	And I enter a valid last name
	And I enter a valid email address
	And I enter comments
	|example comment one | example comment two|
	|valid comments|invalid comments|
	When I click on the submit button
	Then the information should successfully be submitted via the contact us form