Feature: 

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
		

		And the user clicks on the Find Employee button
		When the user sees the search box
		Then the user is able to search employees by email
		
		
		
		