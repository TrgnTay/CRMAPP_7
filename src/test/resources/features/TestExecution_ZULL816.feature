@ZULL-816
Feature: 

	#*User Story:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	#
	# 
	#
	# 
	@ZULL-811
	Scenario: TC01-User should be able to see default filters as "my activity, work, favorite, announcements, and workflows" 
		Given  User logs in with valid credentials
		    When User click on Filter and search box
		    Then User should see default filtres as following options
		      | WORK          |
		      | FAVORITES     |
		      | MY ACTIVITY   |
		      | ANNOUNCEMENTS |
		      | WORKFLOWS     |	

	#User Story: As a user, I should be able to use "Filter and search" functionality on Active Stream
	@ZULL-812
	Scenario: TC02-User should be able add field
		Given  User logs in with valid credentials
		    And User click on Filter and search box
		    Then User click on add field button
		    When User select "Favorites" field
		    Then "Favorites" field should be displayed in field area	

	#*User Story:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	@ZULL-813
	Scenario: TC03-User should be able to remove field
		   Given  User logs in with valid credentials
		    And User click on Filter and search box
		    Then User click on add field button
		    When User deselect "Date" field	

	#*User Story:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	@ZULL-814
	Scenario: TC04-User should be able to save filter
		   Given  User logs in with valid credentials
		    And User click on Filter and search box
		    When User click on save filter button
		    Then User should be able to enter a filter name like "TEST" and save it
		    And  User should see saved filter "TEST" in the filter column.	

	#*User Story:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	@ZULL-815
	Scenario: TC05-User should be able to reset filters to default
		    Given  User logs in with valid credentials
		    And User click on Filter and search box
		    When User click on restore default fields button
		    Then User should see default fields as following options
		      | Date   |
		      | Type   |
		      | Author |
		      | To     |