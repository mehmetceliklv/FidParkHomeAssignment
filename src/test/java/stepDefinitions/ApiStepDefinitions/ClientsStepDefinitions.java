package stepDefinitions.ApiStepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.*;
import utilities.CSVWriter;
import utilities.CSVWriterforAllActiveClients;
import utilities.CSVWriterforAllClients;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static stepDefinitions.Hooks.spec;

public class ClientsStepDefinitions {

    static Response response;

    static int newClientId;

    static Root root=new Root();
    static ClientCreationResponsePojo clientCreationResponsePojo=new ClientCreationResponsePojo();
    static ClientGETResponsePojo clientGETResponsePojo=new ClientGETResponsePojo();
    static AllActiveClientsGETResponsePojo allActiveClientsGETResponsePojo =new AllActiveClientsGETResponsePojo();
    static AllClientsGETCountResponsePojo allClientsGETCountResponsePojo=new AllClientsGETCountResponsePojo();

    ObjectMapper obj=new ObjectMapper();
    static Faker faker= new Faker();
    static String firstName = faker.name().firstName();
    static String lastName = faker.name().lastName();
    static String username = (firstName + lastName).toLowerCase();
    static String email = username + "@mailinator.com";
    static String city = faker.country().capital();
    static String persCode = String.valueOf((faker.number().numberBetween(23456,345677)));

    @Given("User set path params for client creation")
    public void user_set_path_params_for_client_creation() {
        spec.pathParams("1","api","2","v1","3","Clients");
    }
    @Given("User enters expected data for client creation")
    public void user_enters_expected_data_for_client_creation() {
        root.setLastNameOrCompany(lastName);
        root.setFirstName(firstName);
        root.setEmail(email);
        root.setPersCodeOrRegNumber(persCode);
        root.setCity(city);
    }
    @Given("User send request and get response from client creation endpoint")
    public void user_send_request_and_get_response_from_client_creation_endpoint() {
        RestAssured.defaultParser = Parser.JSON;
        response =given().relaxedHTTPSValidation().spec(spec)
                .contentType(ContentType.JSON)
                .body(root).when()
                .post("/{1}/{2}/{3}");
        response.prettyPrint();
    }
    @Then("User  verify API data from client creation endpoint")
    public void user_verify_api_data_from_client_creation_endpoint() throws IOException {
        String responseMessage = response.getBody().asString();
        System.out.println(responseMessage);
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(201, statusCode);

        ClientCreationResponsePojo actualResponse=obj.readValue(response.asString(),ClientCreationResponsePojo.class);
        newClientId=actualResponse.getClientID();
        System.out.println("newClientID :"+newClientId);

        CSVWriter.writeUserToCSV(actualResponse,"AutomatedCreatedClients");
        Assert.assertEquals(root.getFirstName(),actualResponse.getFirstName());
        Assert.assertEquals(root.getLastNameOrCompany(),actualResponse.getLastNameOrCompany());
        Assert.assertEquals(root.getEmail(),actualResponse.getEmail());
        Assert.assertEquals(root.getPersCodeOrRegNumber(),actualResponse.getPersCodeOrRegNumber());
    }

    @Given("User has a valid API endpoint and id for viewing the newly created client")
    public void user_has_a_valid_api_endpoint_and_id_for_viewing_the_newly_created_client() {
        spec.pathParams("1","api","2","v1","3","Clients","4",newClientId);
    }
    @When("User send a GET request to client list endpoint for viewing a single client details")
    public void user_send_a_get_request_to_client_list_endpoint_for_viewing_a_single_client_details() {
        RestAssured.defaultParser = Parser.JSON;
        response =given().relaxedHTTPSValidation().spec(spec)
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}/{4}");
        clientGETResponsePojo= response.getBody().as(ClientGETResponsePojo.class);
        response.prettyPrint();
    }
    @Then("the response status code should be {int} OK")
    public void the_response_status_code_should_be_ok(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }
    @Then("the response should contain the details of the newly created client details")
    public void the_response_should_contain_the_details_of_the_newly_created_client_details() {

        Assert.assertEquals(root.getFirstName(),clientGETResponsePojo.getFirstName());
        Assert.assertEquals(root.getLastNameOrCompany(),clientGETResponsePojo.getLastNameOrCompany());
        Assert.assertEquals(root.getEmail(),clientGETResponsePojo.getEmail());
        Assert.assertEquals(root.getPersCodeOrRegNumber(),clientGETResponsePojo.getPersCodeOrRegNumber());
    }
    @Given("User set path params for updating a single client details")
    public void user_set_path_params_for_updating_a_single_client_details() {
        spec.pathParams("1","api","2","v1","3","Clients","4",newClientId);
    }
    @When("User enter expected data for client update")
    public void user_enter_expected_data_for_client_update() {
        root.setClientID(newClientId);
        root.setLastNameOrCompany("Jackson");
        root.setFirstName("Michael");
        root.setEmail("michaeljackson13@mailinator.com");
        root.setPersCodeOrRegNumber("2024");
    }
    @When("User send a PUT request to update single client details")
    public void user_send_a_put_request_to_update_single_client_details() {
        RestAssured.defaultParser = Parser.JSON;
        response =given().relaxedHTTPSValidation().spec(spec)
                .contentType(ContentType.JSON)
                .body(root).when()
                .put("/{1}/{2}/{3}/{4}");

        response.prettyPrint();
    }
    @Given("User set path params for deleting a single client")
    public void user_set_path_params_for_deleting_a_single_client() {
        spec.pathParams("1","api","2","v1","3","Clients","4",newClientId);
    }
    @Given("User send a DELETE request for deleting a single client")
    public void user_send_a_delete_request_for_deleting_a_single_client() {
        RestAssured.defaultParser = Parser.JSON;
        response =given().relaxedHTTPSValidation().spec(spec)
                .contentType(ContentType.JSON)
                .when()
                .delete("/{1}/{2}/{3}/{4}");
        response.prettyPrint();
    }

    @Given("User has a valid API endpoint to retrieve all active clients")
    public void user_has_a_valid_api_endpoint_to_retrieve_all_active_clients() {
        spec.pathParams("1","api","2","v1","3","Clients");
    }
    @When("User send a GET request to client list endpoint for viewing all active clients")
    public void user_send_a_get_request_to_client_list_endpoint_for_viewing_all_active_clients() {
        RestAssured.defaultParser = Parser.JSON;
        response =given().relaxedHTTPSValidation().spec(spec)
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}");
        allActiveClientsGETResponsePojo = response.getBody().as(AllActiveClientsGETResponsePojo.class);
        response.prettyPrint();

        String filePath = "AllActiveClients.csv";

        // Call the writeClientsToCSV method to write the response body to CSV
        CSVWriterforAllActiveClients.writeActiveClientsToCSV(allActiveClientsGETResponsePojo, filePath);
    }

}
