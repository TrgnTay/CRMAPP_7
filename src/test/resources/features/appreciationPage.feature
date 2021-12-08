@ZULL-846
Feature: 

	Background:
		#@ZULL-797
		Given  User logs in with valid credentials
		#@ZULL-845
		Given Navigate to Appreciation module
		

	#*User Story:* As a user, I should be able to send appreciation by clicking on the Appreciation subheading from "More" tab under Activity Stream
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# #  User should be able to add users by selecting multiple contacts from Employees and Departments contact lists.
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the Comma icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send appreciation.
	@ZULL-841
	Scenario: Mention Feature
		When User click on add mention icon
		    And User clicks on Employees and Departments
		    Then contacts should be listed
		    And User adds "hr78@cybertekschool.com" from contact list
		    Then "hr78@cybertekschool.com" is visible as mentioned
			

	#*User Story:* As a user, I should be able to send appreciation by clicking on the Appreciation subheading from "More" tab under Activity Stream
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# #  User should be able to add users by selecting multiple contacts from Employees and Departments contact lists.
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the Comma icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send appreciation.
	@ZULL-842
	Scenario: Adding users feature
		    When User click on Add more button
		    And User clicks on Employees and Departments
		    Then contacts should be listed
		    And User adds "hr78@cybertekschool.com" from contact list
		    Then "hr78@cybertekschool.com" is visible as recipient
			

	#*User Story:* As a user, I should be able to send appreciation by clicking on the Appreciation subheading from "More" tab under Activity Stream
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# #  User should be able to add users by selecting multiple contacts from Employees and Departments contact lists.
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the Comma icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send appreciation.
	@ZULL-843
	Scenario: Quote function
		    When User clicks on Quote text icon
		    And User writes "Good morning cydeo!"
		    Then The quote should contain the message	

	#*User Story:* As a user, I should be able to send appreciation by clicking on the Appreciation subheading from "More" tab under Activity Stream
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# #  User should be able to add users by selecting multiple contacts from Employees and Departments contact lists.
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the Comma icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send appreciation.
	@ZULL-844
	Scenario: Link feature
		    When User click on attach link icon
		    And User inputs text "YouTube link"
		    And User inputs link "https://www.youtube.com/watch?v=0xs-oaSZdqE&ab_channel=LittleSoul"
		    And User clicks on save
		    //Then link should appear
			Then link text which is "YouTube link" should be displayed
		