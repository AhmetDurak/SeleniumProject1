Feature: Wikipedia search functionality
  Agile story: As a user, when I am on the Wikipedia search page
  I should be able to search whatever I want and see relevant information

  @wikipedia # If you want to run only this scenario, then you should consider name of
    #scenarios not same!!!
  Scenario: Search page title verification
    When user is on Wikipedia search page
    Then user types 'Steve Jobs' in the wikipedia search box and clicks enter
    Then user should see 'Steve Jobs' in wiki title

  @wikipedia2
  Scenario: Search page Header verification
    When user is on Wikipedia search page
    Then user types 'Steve Jobs' in the wikipedia search box and clicks enter
    Then user should see 'Steve Jobs' in main header

  Scenario: Search page Image Header verification
    When user is on Wikipedia search page
    Then user types 'Steve Jobs' in the wikipedia search box and clicks enter
    Then user should see 'Steve Jobs' in image header