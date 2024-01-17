package Runner;

//fOR TESTING 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\Frameworks\\OrangeHrm\\Feature\\login.feature"
			,glue={"StepDefinitions"})
	
public class TestRunner {

}
