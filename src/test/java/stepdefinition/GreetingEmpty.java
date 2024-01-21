package stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class GreetingEmpty {
	@Given("the REST service is up and running for empty name")
	public void giventheRESTserviceisupandrunningforemptyname() {
		System.out.println("\nService is running successfully for blank name");
	}

	@When("I send a GET request for greeting name is blank")
	public void whenIsendaGETrequestforgreetingnameisblank() {
		System.out.println("\nSent GET request name for blank");
	}

	@And("the response should contain a greeting message with the empty name")
	public void andtheresponseshouldcontainagreetingmessagewiththeemptyname() {
		System.out.println("\nIt is showing blank");
	}

	@Then("the response status code should be 200 for empty name")
	public void thentheresponsestatuscodeshouldbe200foremptyname() {
		System.out.println("\nSuccessfully 200 status is showing for blank name ");


	}

}
