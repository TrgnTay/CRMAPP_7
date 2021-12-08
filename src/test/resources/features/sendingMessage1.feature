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
	@ZULL-800
	Scenario: TC - 04 NAT - Sending the message Feature
		    Given User clicks Message button on the top dashboard
		    When  User writes sample text in the message box
		    And   Clicks Send Button
		    Then  Message is sent