
Feature: Wikipedia search functionality
  Agile story: As a user, when I am on the Wikipedia search page
  I should be able to search whatever I want and see relevant information


  @wikipedia
Scenario: Search page title verification
When user is on Wikipedia search page
Then user types 'Steve Jobs' in the wikipedia search box and clicks enter
Then user should see title is 'Steve Jobs'