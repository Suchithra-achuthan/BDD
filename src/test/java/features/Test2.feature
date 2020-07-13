@BorlandTable
Feature: Filling the table
@QuantityDetails
Scenario Outline: Entering Quantity

Given I launched the Borland Home Page
When I clicked on Enter GMO button 
And I enter Quanties as "<Tent>" and "<BP>" and "<Glasses>" and "<Socks>" and "<Boots>" and "<Shorts>"
And I click on Place an Order button
Then I verify Place Order page is open

Examples: 
	|Tent|BP|Glasses|Socks|Boots|Shorts|
	|10	 |5 |15     |20   |10   |30    |
	|3   |5 |20     |10   |5    |20    |
