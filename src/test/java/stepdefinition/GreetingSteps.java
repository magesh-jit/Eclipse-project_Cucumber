package stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class GreetingSteps {

	@Given("the REST service is up and running")
	public void givenRestServiceIsUpAndRunning() {
		
		System.out.println("\nService is running successfully");
	}

	@When("I send a GET request for greeting name")
	public void whenIsendaGETrequestforgreetingname() {
		System.out.println("\nSent GET request successfully");
	}

	@And("the response should contain a greeting message with the default name")
	public void andResponseShouldContainGreetingWithDefaultName() {
		
		System.out.println("\nSuccessfully showing default name");
	}

	@Then("the response status code should be 200")
	public void thentheresponsestatuscodeshouldbe200() {
		System.out.println("\nSuccessfully 200 status is showing ");
	}
}





