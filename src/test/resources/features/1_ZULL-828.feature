@ZULL-839 @CRM
Feature: MRT-ZULL-785-TEST EXECUTION

	Background:
		#@ZULL-828
		Given  User logs in with valid credentials
		

	#*User Story:* As a user, I should be able to create events by clicking on Event tab under Activity Stream
	#
	#*Acceptance Criteria:*
	# # User should be able to add Event start and ending date and time and specify the time zone.
	# # *User should be able to set a reminder.*
	# # User should be able to select event location from the dropdown.
	# # User should be able to add attendees by selecting contacts individually or adding groups and departments.
	# # User should be able to click on More to see the event details.
	# # User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance
	# # User should be able to send messages.
	@ZULL-826
	Scenario: MRT_TC01 User sets reminder
		    When user clicks Event icon
		    Then user should be able to set a reminder	

	#*User Story:* As a user, I should be able to create events by clicking on Event tab under Activity Stream
	#
	#*Acceptance Criteria:*
	# # User should be able to add Event start and ending date and time and specify the time zone.
	# # User should be able to set a reminder.
	# # User should be able to select event location from the dropdown.
	# # User should be able to add attendees by selecting contacts individually or adding groups and departments.
	# # User should be able to click on More to see the event details.
	# # *User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance*
	# # User should be able to send messages.
	@ZULL-829
	Scenario: MRT_TC02 User should be able to see event details parameters as Availability, Repeat, Calendar, Importance
		    When user clicks Event icon
		    Then User should be able to click on More to see the event details
		    And User should be able to see event details parameters as follows
		      | Availability |
		      | Repeat       |
		      | Calendar     |
		      | Importance   |	

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

	#*User Story:* As a user, I should be able to create events by clicking on Event tab under Activity Stream
	#
	#*Acceptance Criteria:*
	# # User should be able to add Event start and ending date and time and specify the time zone.
	# # User should be able to set a reminder.
	# # User should be able to select event location from the dropdown.
	# # User should be able to add attendees by selecting contacts individually or adding groups and departments.
	# # User should be able to click on More to see the event details.
	# # User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance
	# # *User should be able to send messages.*
	@ZULL-832
	Scenario: MRT_TC04 User send messages
		    When user clicks Event icon
		    Then User should be able to send a message