@wip
Feature: Login scenario using maps/ alternative practice

  Scenario: User should be able to see all 12 months in
  months
  dropdown
    Given User is on the login page of Web table app
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then User should see url contains orders