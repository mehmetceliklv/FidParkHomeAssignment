@ApiClientsUpdate @Api @All
Feature: Api Client Update
  PUT REQUEST - /api/v1/Clients/{client_id}

  Scenario Outline: Verify API PUT Request to update single client details by ID
    Given User sets path params "<object>""<key>"
    When  User enters expected data for client update with the following details:
      | key       | firstName  | lastName  | email   | persCode   | city    |
      | <key>     | <firstName>| <lastName>| <email> | <persCode> | <city>  |
    And   User sends a PUT request
    Then  the response status code should be 204 OK

    Examples:
      | object      | key       | firstName | lastName | email                      | persCode | city           |
      | Clients     | 79        | Ali1    | Celik       | ali.celik@mailinator.com   | 123486   | New York1      |
      | Clients     | 77        | Ahmet1  | Sahin       | ahmet.sahin@mailinator.com | 783012   | Los Angeles1   |
      | Clients     | 78        | Murat1  | Akca        | murat.akca@mailinator.com  | 341678   | San Francisco1 |
