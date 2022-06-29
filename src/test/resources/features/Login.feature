
Feature: As a user, I should be able to login with correct credentials to different accounts
  And dashboard should be displayed.

  #It runs before each feature line which is under it
  Background: For the scenarios in the feature file, use is expected to be on login page
    Given user is on the library login page

  @Librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @Student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard
  @Admin @Login
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard


#this is how we add comments in feature file
