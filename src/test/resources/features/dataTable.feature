
Feature: Examples of Cucumber data table implementations

  Scenario: List of fruits I like
    Then user should see fruits I like
      | Kiwi        | 3 |
      | Banana      | 5 |
      | cucumber    | 6 |
      | orange      | 6 |
      | grape       | 2 |
      | pomegranate | 1 |
  @wip
  Scenario: Correct non-zero number of books found by author by list
    Given I have the following books in the store by list
      | The Devil in the White City          | Erik Larson |
      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
      | In the Garden of Beasts              | Erik Larson |
    When I search for books by author Erik Larson
    Then I find 2 books