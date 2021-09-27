package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "D://workspace//CucumberUrbanLadder//src//test//java//Feature//UrbanLadder.feature",
		glue= {"WholeStepDefinition"}
		)
public class testRunner {

}
