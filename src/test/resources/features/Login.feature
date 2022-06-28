@Regression @Smoke
Feature: As a user, I should be able to login with correct credentials to different accounts
  And dashboard should be displayed.
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
  @Admin
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

#this is how we add comments in feature file
