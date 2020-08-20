package Cucumber.Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//main//resources//Feature//facebook.feature",
				glue= "org.stepdefinition",
				dryRun=false,monochrome=true,
				plugin= {"html:target//Cucumber-html-reports","json:target//reports.json"}
		)

public class TestRunner {

}
