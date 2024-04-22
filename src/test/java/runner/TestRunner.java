package runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"stepDefinition"}, 
monochrome = true,
plugin={"pretty","html:target/HTMLReports", "pretty","json:target/JSONReports/report.json",
		"pretty","junit:target/JUNITReports/report.junit"},
tags= "@smoketest"
		)

public class TestRunner {

}
