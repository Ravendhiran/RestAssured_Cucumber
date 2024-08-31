package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getIncidents {
	public static Response response;

	@Given("Set the endpoint")
	public void set_the_endpoint() {
		RestAssured.baseURI="https://dev254312.service-now.com/api/now/table/";
	}
	@Given("Set the Auth")
	public void set_the_auth() {
		RestAssured.authentication=RestAssured.basic("admin", "SfyAXaBq4*7+");
	}
	@When("get incidents")
	public void get_incidents() {
		response = RestAssured.get("incident");
	}
	@Then("Validate the response code is {int}")
	public void validate_the_response_code_is(Integer int1) {
		response.prettyPrint();
	}

}
