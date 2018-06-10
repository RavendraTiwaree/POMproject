package cucumberProject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@CucumberOptions (features = "src/main/java/cucumberProject/AppLogin.feature", glue = "cucumberProject", 
monochrome = true)
@RunWith (Cucumber.class)
public class AppLoginRunTest {

	
	
}
