
@ApiClientsCreationEndToEnd  @Api @All
Feature: Api Client Creation End-to-End

  Scenario:Verify API POST Request for creation of client with all mandatory fields filled

    Given User set path params for client creation
    Given User enters expected data for client creation
    And   User send request and get response from client creation endpoint
    Then  User  verify API data from client creation endpoint


  Scenario: Verify API GET Request to retrieve newly created client details by ID

    Given User has a valid API endpoint and id for viewing the newly created client
    When  User send a GET request to client list endpoint for viewing a single client details
    Then  the response status code should be 200 OK
    And   the response should contain the details of the newly created client details


  Scenario: Verify API PUT Request to update single client details by ID

    Given User set path params for updating a single client details
    When  User enter expected data for client update
    And   User send a PUT request to update single client details
    Then  the response status code should be 204 OK

  Scenario: Verify API DELETE Request to delete a single client by ID

    Given User set path params for deleting a single client
    And   User send a DELETE request for deleting a single client
    Then  the response status code should be 204 OK
