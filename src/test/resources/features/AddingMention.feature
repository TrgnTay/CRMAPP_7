Feature: 

	Background:
		#@ZULL-797
		Given  User logs in with valid credentials
		

	#User *Story:*  As a user, I should be able to send messages by clicking on Message tab under Active Stream
	#
	#*Acceptance Criteria:*
	#1. User should be able to click on upload files icon to upload files and pictures from local disks.
	#2. User should be able to add users by selecting multiple contacts from Employees and Departments contact lists.
	#3. User should be able to attach a link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon.
	#7. User should be able to send a message.
	@ZULL-798 @smoke
	Scenario: TC -02 NAT - Adding Mention Feature
		    Given User clicks Message button on the top dashboard
		    When  User clicks mention icon
		    When  User selects an email
		    Then  Email is displayed in the message box