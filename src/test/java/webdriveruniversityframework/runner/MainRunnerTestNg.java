package webdriveruniversityframework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"src/test/java/webdriveruniversityframework/feature"},
		glue = {"webdriveruniversityframework.steps"},
		monochrome = true,
		dryRun = false, // dryrun = true will execute the feature file not the step file
		tags = {"@Live"},
		plugin = {"pretty","html:target/cucumber","json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class MainRunnerTestNg extends AbstractTestNGCucumberTests {

}
