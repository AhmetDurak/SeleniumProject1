
Feature: Examples of Cucumber data table implementations

@DataTable2
  Scenario: List of fruits I like
    Then user should see fruits I like
      | Kiwi        | 3 |
      | Banana      | 5 |
      | cucumber    | 6 |
      | orange      | 6 |
      | grape       | 2 |
      | pomegranate | 1 |


  @DataTableTask
    #Task 6.2
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |