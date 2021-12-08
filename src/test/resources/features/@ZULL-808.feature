Feature:
	Background:
		Given  User logs in with valid credentials
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
		
		
		
		
		
		