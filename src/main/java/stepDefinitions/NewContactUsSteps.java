package stepDefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

import org.junit.Assert;

public class NewContactUsSteps extends DriverFactory {
	
	@Given("^I access webdriveruniversity contact us form$")
	public void i_access_webdriveruniversity_contact_us_form() throws Exception {
		contactUsPage.getContactUsPage();
		//driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	}

	@When("^I enter a valid firstname$")
	public void i_enter_a_valid_firstname() throws Exception  {
		contactUsPage.enterFirstName("tom");
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("tom");
	}

	@When("^I enter a valided last name$")
	public void i_enter_a_valid_last_name(DataTable dataTable) throws Exception {
		//List<List<String>> data = dataTable.raw();
		contactUsPage.enterLasttName(dataTable, 0, 1);
		//driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys(data.get(0).get(1));
	}

	@And("^i enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Exception  {
		contactUsPage.enterEmailAddress("webdriveruniversity@outlook.com");
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("webdriveruniversity@outlook.com");
	}

	@And("^i enter comments$")
	public void i_enter_comments(DataTable dataTable) throws Exception {
		contactUsPage.enterComments(dataTable, 0, 1);
		/*List<List<String>> data = dataTable.raw();
		diver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(data.get(0).get(1));*/
	}

	@When("^i click on the submit button$")
	public void i_click_on_the_submit_button() throws Exception {
		contactUsPage.clickOnSubmiButton();
		//driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
	}

	@Then("^the information should be successfully submitted via the contact us form$")
	public void the_information_should_be_successfully_submitted_via_the_contact_us_form() throws Throwable {
		contactUsPage.confirmContactUsFormSubmissionWasSuccessful();
		/*Thread.sleep(3000);
		WebElement thanksContactUsPage = driver.findElement(By.xpath(".//*[@id='contact_reply']/h1"));
		//expected actual
		Assert.assertEquals("thankyouforyourmessage!", thanksContactUsPage.getText().toLowerCase().replaceAll("[ ()0-9]", ""));*/
	}
}
