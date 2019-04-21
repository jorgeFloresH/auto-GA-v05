package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.customrestassure.HandleRequest;

import static org.testng.Assert.assertEquals;

/**
 * @autor Marcelo Garay
 */
public class PostManStepdefs {
    private Response response;
    //    private Response response1;

    @Given("^GET \"([^\"]*)\" postman endpoint is configured$")
    public void getPostmanEndpointIsConfigured(String headerEndpoint) throws Throwable {
        response = HandleRequest.get(headerEndpoint);
    }

    @Then("^the status code should be (\\d+)$")
    public void theStatusCodeShouldBe(int statusCode) throws Throwable {
        assertEquals(response.getStatusCode(), statusCode);
    }

    @Given("^POST \"([^\"]*)\" postman endpoint is configured whit value \"([^\"]*)\"$")
    public void postPostmanEndpointIsConfiguredWhitValue(String bodyEndPoint, String body) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        response = HandleRequest.post(bodyEndPoint, body);
    }

    @Then("^the response 'data' value is \"([^\"]*)\"$")
    public void theRespondeDataValueIs(String esperado) throws Throwable {
        boolean actual = response.getBody().print().contains(esperado);
//        byte[] actual1 = response1.getBody().asByteArray();
//        assertEquals(esperado,test,"no jala");
        Assert.assertTrue(actual, "diplomado testing existe en body  de la respuesta");
    }

    @And("^the status code post should be (\\d+)$")
    public void theStatusCodePostShouldBe(int statusCode1) {
        assertEquals(response.getStatusCode(), statusCode1);
    }


}
