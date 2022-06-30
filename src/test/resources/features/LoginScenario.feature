Feature: Login scenario using maps/ alternative practice

  Scenario: User should be able to login with credentials
    Given User is on the login page of Web table app
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then User should see url contains orders


  @wip @LoginScenario
  #Day17_WebTable_Task2-1
  Scenario Outline: User should make a new order
    Given user is already logged in to web table app
    When user is on the “Order” page
    Then user enters appropriate test data: '<Product>','<Quantity>','<Customer name>','<Street>','<City>','<State>','<Zip>','<Card type>','<Card No>','<Expiry Date>'
    And user clicks to Process Order
    Then user should see new order in the table on View all orders page

    Examples: User enters product, address and payment information
      | Product   | Quantity | Customer name | Street        | City      | State  | Zip   | Card type  | Card No          | Expiry Date |
      | Familybea | 2        | Tom Jerry     | Nicola street | Frankfurt | Hessen | 87091 | MasterCard | 5400725012345678 | 04/24       |