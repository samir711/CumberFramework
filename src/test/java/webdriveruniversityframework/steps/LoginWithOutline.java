package webdriveruniversityframework.steps;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class LoginWithOutline {
	
	WebDriver driver;
	@Before("@Live") 
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath() +  "\\src\\test\\java\\CucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	@Before("@Live") 
	public void setupInternetExplorer() throws IOException {
		System.setProperty("webdriver.ie.driver", Paths.get(System.getProperty("user.dir")).toRealPath() +  "\\src\\test\\java\\CucumberFramework\\resources\\IEDriverServer.exe");
		this.driver = new InternetExplorerDriver();;
		this.driver.manage().window().maximize();
		//this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	
	@Before("@Live")
	public void setupFirefox() throws IOException {
		System.setProperty("webdriver.gecko.driver", Paths.get(System.getProperty("user.dir")).toRealPath() +  "\\src\\test\\java\\CucumberFramework\\resources\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	@After("@InProgress")
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	@Given("^user naviage to \"([^\"]*)\"$")
	public void user_naviage_to(String url) throws Throwable {
		driver.get(url);
	}

	@When("^user clicks on the login portal button$")
	public void user_clicks_on_the_login_portal_button() throws Throwable {
		driver.findElement(By.id("login-portal")).click();
	}

	@When("^user enters the \"([^\"]*)\" username$")
	public void user_enters_the_username(String username) throws Throwable {
		//tab code
		for (String windHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windHandle);
		}
		//send username keys
		driver.findElement(By.id("text")).sendKeys(username);
	}

	@When("^user enters the \"([^\"]*)\" password$")
	public void user_enters_the_password(String password) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(password);	
	}
	

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("^the user should be presented with the following prompt alert \"([^\"]*)\"$")
	public void the_user_should_be_presented_with_the_following_prompt_alert(String message) throws Throwable {
		Alert alert = driver.switchTo().alert(); //Alert	
		assertEquals(alert.getText().toString().toLowerCase().replaceAll("\\s", ""), message.toLowerCase().replaceAll("\\s", ""));
		alert.accept();
	}
}
