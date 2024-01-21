package stepdefinition;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/feature", glue = {"stepdefinition"}, plugin = {"pretty","junit:target/JUnitreports/reports.xml"})
	
	public class CucumberRunner {
		
}
	
