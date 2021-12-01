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
		And the user clicks on the employees function
		When the user clicks on the Add department button
		Then the user is able to add a department
		