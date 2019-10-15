package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		format={"pretty","html:report/html","json:report/json/cucumber.json"},
		tags={"@test1"},
		features="src/main/java/feature",
		glue={"stepDefinition"}
		
		)

public class testrunner extends AbstractTestNGCucumberTests{

}
