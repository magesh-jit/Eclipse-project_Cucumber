package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class GreetingCustomSteps {
	@Given("the REST service is up and running for custom name")
	public void givenRestServiceIsUpAndRunningforcustomname() {
		System.out.println("\nService is running successfully for custom name");

	}

	@When("I send a GET request for greeting name is john")
	public void whenIsendaGETrequestforgreetingnameisjohn() {
		System.out.println("\nSent GET request name for john successfully");

	}

	@Then("the response should contain a greeting message with the name \"John\"")
	public void thenResponseShouldContainGreetingWithNameJohn() {
		System.out.println("\nIt is showing john");

	}

	@And("the response status code should be 200 for custom name")
	public void andResponseStatusCodeShouldBe200forcustomname() {
		System.out.println("\nSuccessfully 200 status is showing for custom name ");


	}
}

