@ApiGetClients  @Api @All
Feature: Api GetAllClients by Admin

  @ApiGetAllActiveClients
  Scenario: Verify API GET Request to retrieve all active clients

    Given User has a valid API endpoint to retrieve all active clients
    When  User send a GET request to client list endpoint for viewing all active clients
    Then  the response status code should be 200 OK
