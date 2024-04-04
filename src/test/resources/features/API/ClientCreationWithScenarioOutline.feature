@ApiClientsCreation @Api @All
Feature: Api Client Creation
  POST REQUEST - /api/v1/Clients

  Background:
    Given User has a valid API endpoint for client creation

  Scenario Outline: Verify API POST Request for creation of client with all mandatory fields filled
    Given User enters expected data for client creation with the following details:
      | firstName  | lastName  | email   | persCode   | city    |
      | <firstName>| <lastName>| <email> | <persCode> | <city>  |

    When User sends a POST request to client creation endpoint
    Then the response status code should be 201 OK
    And the response should contain the details of the newly created client
      | firstName  | lastName  | email   | persCode   | city    |
      | <firstName>| <lastName>| <email> | <persCode> | <city>  |

    Examples:
      | firstName | lastName | email                      | persCode | city          |
      | Ali       | Akca     | ali.akca@mailinator.com    | 198954   | New York      |
      | Mehmet    | Sahin    | mehmet.sahin@mailinator.com| 378458   | Los Angeles   |
      | Kerem     | Celik    | kerem.celik@mailinator.com | 048689   | San Francisco |
