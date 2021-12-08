@ZULL-824
Feature: 

	Background:
		#@ZULL-822
		Given User logs in with valid credentials
		

	#*User Story:* As a user, I should be able to send announcements from Announcement subheading from "More" under Activity Stream
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# # User should be able to add users by selecting multiple contacts from Employees and Departments contact lists. 
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the quato text icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send an announcement.
	#
	# 
	@ZULL-818 @ZULL-823
	Scenario: selecting multiple contacts
		    When User navigates to "More" "Announcement"
		    And  clicks Add Mention icon
		    And clicks Employees and Departments
		    And  User selects "Ginger Cat" and "HR3 USER" from Employees and Departments contact lists
		   Then  The input box should show descriptions containing "Ginger Cat" and "HR3 USER"	

	#*User Story:* As a user, I should be able to send announcements from Announcement subheading from "More" under Activity Stream
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# # User should be able to add users by selecting multiple contacts from Employees and Departments contact lists. 
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the quato text icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send an announcement.
	@ZULL-819 @ZULL-823
	Scenario: attach a link
		 When User navigates to "More" "Announcement"
		   And clicks Link icon
		  And enters "zerobankApp" in the text input box
		  And copy paste "http://zero.webappsecurity.com" in the link input box
		  And clicks Save
		  And clicks Send
		    And clicks zerobankApp
		  Then the page and the title contains "Zero - Personal Banking - Loans - Credit Cards"	

	#*User Story:* As a user, I should be able to send announcements from Announcement subheading from "More" under Activity Stream
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# # User should be able to add users by selecting multiple contacts from Employees and Departments contact lists. 
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the quato text icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send an announcement.
	@ZULL-820 @ZULL-823
	Scenario: create a quote
		    When User navigates to "More" "Announcement"
		    And clicks quote test icon
		  And enter "crm project"
		  And clicks Send
		  Then the text "crm project" should be displayed on the page	

	#*User Story:* As a user, I should be able to send announcements from Announcement subheading from "More" under Activity Stream
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# # User should be able to add users by selecting multiple contacts from Employees and Departments contact lists. 
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the quato text icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send an announcement.
	@ZULL-821 @ZULL-823
	Scenario: send an announcement
		      When User navigates to "More" "Announcement"
		      And enters "cest la vie" in the Announcement input box
		      And clicks Send
		      Then the textt "cest la vie" should be displayed on the page