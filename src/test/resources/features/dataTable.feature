
Feature: Examples of Cucumber data table implementations


  Scenario: List of fruits I like
    Then user should see fruits I like
      | Kiwi        | 3 |
      | Banana      | 5 |
      | cucumber    | 6 |
      | orange      | 6 |
      | grape       | 2 |
      | pomegranate | 1 |
