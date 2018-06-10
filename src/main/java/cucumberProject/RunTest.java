package cucumberProject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//glue =  Package Name
@CucumberOptions(features = "src/main/java/cucumberProject/CreateLead.feature",glue = "cucumberProject")
@RunWith(Cucumber.class)
public class RunTest {

}

