package runnner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		format = {"pretty","html:Reports/Cucumber-reports/Cucumber-pretty"},
		tags = {"@ErrorMessageValidation"},
		features = "src/test/java/features",
		glue = {"stepdefinitions"}
		)

public class Testrunner extends AbstractTestNGCucumberTests{

}
