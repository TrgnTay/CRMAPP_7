@ZULL-810
Feature: 

	#*User Story:* As a user, I should be able to use functions under Employee menu
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to display company structure. 
	# # *{color:#de350b}User should be able to add a department{color}.*
	# # User should be able to find employees by search box.
	# # User should be able to find employees by search by Alphabet.
	# # User should be able to export the employee list.
	# # User should be able to display telephone directory
	# # User should be able to send message to employee from the telephone directory
	@ZULL-806
	Scenario: User should be able to add a Department
		        Given the user is on the Portal Page
				And the user clicks on the employees
				When the user clicks on the Add department button
				Then the user should see add department pop-up
				Then the user is able to add a department name
				Then the user clicks on add button
			

	#*User Story:* As a user, I should be able to use functions under Employee menu
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to display company structure. 
	# # User should be able to add a department.
	# # *{color:#de350b}User should be able to find employees by search box.{color}*
	# # User should be able to find employees by search by Alphabet.
	# # User should be able to export the employee list.
	# # User should be able to display telephone directory
	# # User should be able to send message to employee from the telephone directory
	@ZULL-807
	Scenario: User should be able to find employees by search box.
		
		
		        And the user clicks on the employees
				And the user clicks on the Find Employee button
				When the user sees the search box
				Then the user is able to search employees by search box
		
		
		
			

	#*User Story:* As a user, I should be able to use functions under the Employee menu
	#
	# 
	#
	#*Acceptance Criteria:*
	# # *{color:#de350b}User should be able to display the company structure.{color}* 
	@ZULL-808
	Scenario: User should be able to display the Company Structure
		
		
		        And the user clicks on the employees
				Then the user is able to display the Company Structure
				
		
		
		
		
		