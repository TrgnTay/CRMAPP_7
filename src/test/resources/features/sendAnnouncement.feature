@wip
Feature:
  add users

  Background: log in
    Given User logs in with valid credentials

    Scenario: send an announcement

      When User navigates to "More" "Announcement"
      And enters "cest la vie" in the Announcement input box
      And clicks Sendbutton
      Then the textt "cest la vie" should be displayed on the page
