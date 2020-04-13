Feature: Search functionality scenarios

@Search @1
Scenario: Verify whether the User is able to search for products
	Given I launch the application
	When I search for a product say "Samsung SyncMaster 941BW" 
Then I should see the product in the search results
	
	@Search @2
Scenario: Verify whether the User is informed when the product we are searching is not available
	Given I launch the application
	When I search for a product say "Apple iPhone"
Then I should see the page displaying the message "Your shopping cart is empty!"

