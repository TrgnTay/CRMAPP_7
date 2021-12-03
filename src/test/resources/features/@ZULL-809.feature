@ZULL-809
Feature:
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
	@ZULL-801
	Scenario: User should be able to make a comment, like, or unfollow on other employees' posts. 
		Given The user is on the Portal page.
		When The user clicks on the comment, the user is able to make a comment on the employees' posts.
		When The user clicks on the like, the user is able to like the posts.
		Then The user clicks on the unfollow, the user is able to unfollow the user's posts.

	#*User Story:* As a user, I should be able to interact with employees on the posts that I have access to.
	#
	#*Acceptance Criteria:*
	# # User should be able to make a comment, like, or unfollow on other employees' posts. 
	# # User should be able to like or make comments on all other reviewers' comments. 
	# # User should be able to click on reviewers' names and visit their profiles.
	# # User should be able to add others' posts to favorite by clicking on the Star icon.
	#
	# 
	@ZULL-802
	Scenario: User should be able to like or make comments on all other reviewers' comments
		Given The user is on the Portal page.
		When The user clicks on the like, the user is able to like other reviewers' comments.
		Then The user clicks on the reply, the user is able to make a comment on the reviewers's comments.
	#*User Story:* As a user, I should be able to interact with employees on the posts that I have access to.
	#
	#*Acceptance Criteria:*
	# # User should be able to make a comment, like, or unfollow on other employees' posts. 
	# # User should be able to like or make comments on all other reviewers' comments. 
	# # User should be able to click on reviewers' names and visit their profiles.
	# # User should be able to add others' posts to favorite by clicking on the Star icon.
	#
	# 
	@ZULL-803
	Scenario: User should be able to click on reviewers' names and visit their profiles.
		Given The user is on the Portal page.
		When The user is able to click on reviewers' names.
		Then The user is able to visit the reviewers' profiles.	

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