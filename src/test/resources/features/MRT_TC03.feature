@MRT_TC03
Feature: MRT_TC03 User clicks on more to see event

	Background:
		#@ZULL-828
		Given  User logs in with valid credentials
		

	#*User Story:* As a user, I should be able to create events by clicking on Event tab under Activity Stream
	#
	#*Acceptance Criteria:*
	# # User should be able to add Event start and ending date and time and specify the time zone.
	# # User should be able to set a reminder.
	# # User should be able to select event location from the dropdown.
	# # User should be able to add attendees by selecting contacts individually or adding groups and departments.
	# # *User should be able to click on More to see the event details.*
	# # User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance
	# # User should be able to send messages.
	@ZULL-830
	Scenario: MRT_TC03 User clicks on more to see event
		    When user clicks Event icon
		    Then User should be able to click on More to see the event details