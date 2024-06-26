package runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"stepDefinition"}, 
monochrome = true,
plugin={"pretty","html:target/cucumber-reports/cucumber-html-report.html", "pretty","json:target/JSONReports/report.json",
		"pretty","junit:target/JUNITReports/report.junit"})

public class TestRunner {

}
