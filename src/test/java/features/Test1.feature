@Signin
Feature: DemoAutomation Sign-in 
@ErrorMessageValidation @SIT 
Scenario: Check Error message in Sign-in

Given I launched the Home page
When I clicked on Sign-in button 
And I enter Email as "such@gmail.com"
And I enter Password as "Testing1"
And I click on Enter button
Then I verify error message is displayed as "Invalid User Name or PassWord"

@PositiveFlow @SIT 
Scenario: Check Error message in Sign-in

Given I launched the Home page
When I clicked on Sign-in button 
And I enter Email as "suchi@gmail.com"
And I enter Password as "Testing1"
And I click on Enter button
Then I verify Register page is displayed