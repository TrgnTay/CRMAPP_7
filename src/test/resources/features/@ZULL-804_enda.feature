Feature:  User should be able to add others' posts to favorite by clicking on the Star icon.
	Background:
		Given User logs in with valid credentials

	#*User Story:* As a user, I should be able to interact with employees on the posts that I have access to.
	#
	#*Acceptance Criteria:*
	# # User should be able to make a comment, like, or unfollow on other employees' posts. 
	# # User should be able to like or make comments on all other reviewers' comments. 
	# # User should be able to click on reviewers' names and visit their profiles.
	# # User should be able to add others' posts to favorite by clicking on the Star icon.
	#
	# 
	@ZULL-804
	Scenario: User should be able to add others' posts to favorite by clicking on the Star icon.
		Given The user is on the Portal page.
		When The user clicks on the star.
		Then The user is able to click the star icon.
