Feature: As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.

  Background:
    Given User logs in with valid credentials
    And The user clicks on the Services button on the left side of the screen
    Then The user clicks on the Ideas button on the top dashboard

  #User Story: As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.

  #Acceptance Criteria:
  #1. User can suggest new idea by clicking "New idea" under Ideas page of Services module.
  #2. User can dislike the idea.
  #3. User can like the idea.
  #4. User can sort the ideas by date added.
  #5. User can sort the ideas by rating.
  #6. User should be able to create new category by clicking "New category" under Ideas page of Services module.
  #7. User can print the lists by clicking "Print" button under Lists page of Services menu.

    #1
  Scenario: User can suggest new idea by clicking "New idea" under Ideas page of Services module.
    When The user clicks the New Idea button
    And The user enters the information required
    And The user clicks the Suggest New Idea button
    Then The idea should be created successfully

    #2
  Scenario: User can dislike the idea.
    When The user clicks the dislike button
    Then The post should have a red number -1

    #3
  Scenario: User can like the idea.
    When The user clicks the like button
    Then The post should have a green number 1

    #6
  Scenario: User should be able to create new category by clicking "New category" under Ideas page of Services module.
    When The user clicks the New Category button
    And The user enters the information
    And The user clicks the Save and Add button
    Then The category should be added