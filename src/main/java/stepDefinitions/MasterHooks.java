package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class MasterHooks extends DriverFactory {
	
	@Before
	public void setup() throws Exception {
		driver = getDriver();
	}
	
	@After
	public void tearDownAndScreenShotOnFailure(Scenario scenario) {
		try {
			if(driver != null && scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
				
			}
			
			if(driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
		}
		} catch(Exception e) {
			System.out.println("Method Failed: tearDownAndScreenShotOnFailure, Exception: " + e.getMessage());
		}
	}
/*	public void tearDown() {
		try {
			if(driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
		}
		} catch(Exception e) {
			System.out.println("Method Failed: screenshotOnFailure, Exception: " + e.getMessage());
		}
	}*/
	
	
	
	

}
