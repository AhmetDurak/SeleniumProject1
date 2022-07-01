Feature: Login scenario using maps/ alternative practice

  Scenario: User should be able to login with credentials
    Given User is on the login page of Web table app
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then User should see url contains orders

  @wip @LoginScenario
  #Day17_WebTable_Task2-1
  Scenario Template: User should make a new order
    Given user is already logged in to web table app
    When user is on the “Order” page
    Then user enters appropriate test data: '<Product>','<Quantity>','<Customer name>','<Street>','<City>','<State>','<Zip>','<Card type>','<Card No>','<Expiry Date>'
    And user clicks to Process Order
    Then user should see new order in the table on View all orders page '<Expected name>'

    @maleScientists
    Examples: Famous male scientists
      | Product    | Quantity | Customer name     | Street        | City      | State  | Zip   | Card type  | Card No          | Expiry Date | Expected name     |
      | Familybea  | 2        | Albert Einstein   | Nicola street | Frankfurt | Hessen | 87091 | MasterCard | 5400725012345678 | 04/24       | Albert Einstein   |
      | MoneyCog   | 2        | Archimedes     | Nicola street | Frankfurt | Hessen | 87091 | MasterCard | 5400725012345678 | 04/24       | Archimedes        |
      | Screenable | 2        | Neil deGray Tyson | Nicola street | Frankfurt | Hessen | 87091 | MasterCard | 5400725012345678 | 04/24       | Neil deGray Tyson |
      | MoneyCog   | 1        | Erwin Schrödinger | Nicola street | Frankfurt | Hessen | 87091 | MasterCard | 5400725012345678 | 04/24       | Erwin Schrödinger |

    @femaleScientists
    Examples: Famous female scientists
      | Product    | Quantity | Customer name        | Street        | City      | State  | Zip   | Card type  | Card No          | Expiry Date | Expected name        |
      | Familybea  | 2        | Marie Curie          | Nicola street | Frankfurt | Hessen | 87091 | MasterCard | 5400725012345678 | 04/24       | Marie Curie          |
      | MoneyCog   | 2        | Rosalind Franklin    | Nicola street | Frankfurt | Hessen | 87091 | MasterCard | 5400725012345678 | 04/24       | Rosalind Franklin    |
      | Screenable | 2        | Gertrude Belle Elion | Nicola street | Frankfurt | Hessen | 87091 | MasterCard | 5400725012345678 | 04/24       | Gertrude Belle Elion |
      | MoneyCog   | 1        | Lise Meitner         | Nicola street | Frankfurt | Hessen | 87091 | MasterCard | 5400725012345678 | 04/24       | Lise Meitner         |