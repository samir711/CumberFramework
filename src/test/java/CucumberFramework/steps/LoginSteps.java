package CucumberFramework.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	WebDriver webDriver;

	@Before("@testdevelopment")
	public void Setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\CucumberFramework\\CumberFramework\\src\\test\\java\\CucumberFramework\\resources\\geckodriver.exe");
		this.webDriver = new FirefoxDriver();
		this.webDriver.manage().window().maximize();
		this.webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		System.out.println("Inside Setup");

	}

	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		webDriver.get("https://stackoverflow.com/");
		System.out.println("User navigates to stackoverflow website");
	}

	@Given("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() {
		webDriver.findElement(By.cssSelector(".login-link.btn-clear")).click();;
		
		System.out.println("ser clicks on the login button on homepage");
	}

	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() { 
		System.out.println("User enters a valid username");
		webDriver.findElement(By.cssSelector("#email")).sendKeys("samirdoc1@gmail.com");
	}

	@Given("^User enters a valid password$")
	public void user_enters_a_valid_password() {
		System.out.println("User enters a valid password");
		webDriver.findElement(By.cssSelector("#password")).sendKeys("vijay1980");
		
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() {
		System.out.println("User clicks on the login button");
		webDriver.findElement(By.cssSelector("#submit-button")).click();;
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() {
		WebElement  askQuestionButton  = webDriver.findElement(By.cssSelector(".ws-nowrap.btn"));
		Assert.assertEquals(askQuestionButton.getText(), "Ask Question");
		System.out.println("User should be taken to the successful login page");
	}

	@Given("^User navigates to stackoverflow website(\\d+)$")
	public void user_navigates_to_stackoverflow_website(int arg1) {
		System.out.println("User navigates to stackoverflow website2");
	}

	@Given("^User clicks on the login button on homepage(\\d+)$")
	public void user_clicks_on_the_login_button_on_homepage(int arg1) {
		System.out.println("User navigates to stackoverflow website2");
	}

	@Given("^User enters a valid username(\\d+)$")
	public void user_enters_a_valid_username(int arg1) {
		System.out.println("User navigates to stackoverflow website2");
	}

	@Given("^User enters a valid password(\\d+)$")
	public void user_enters_a_valid_password(int arg1) {
		System.out.println("User navigates to stackoverflow website2");
	}

	@When("^User clicks on the login button(\\d+)$")
	public void user_clicks_on_the_login_button(int arg1) {
		System.out.println("User navigates to stackoverflow website");
	}

	@Then("^User should be taken to the successful login page(\\d+)$")
	public void user_should_be_taken_to_the_successful_login_page(int arg1) {
		System.out.println("User navigates to stackoverflow website2");
	}

}
