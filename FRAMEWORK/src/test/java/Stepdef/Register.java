package Stepdef;

import org.junit.Assert;

import Base.testBase;
import Pages.AccountSuccessPage;
import Pages.RegisterPage;
import Pages.headersPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Register {
	headersPage headers = new headersPage();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage accountSuccess = new AccountSuccessPage();

	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
//		String a = testBase.reader.getUrl();
//		testBase.driver.get(a);
		testBase.driver.get(testBase.reader.getUrl());

	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page() throws Throwable {
		// testBase.driver.findElement(By.xpath("//span[text()='My Account']")).click();
		// testBase.driver.findElement(By.xpath(headerSection.myAccountLink.toString()));
		// Elements.click(headerSection.myAccountLink);
		Thread.sleep(5000);
		headers.myAccountLink.click();
		// headers.myAccountLink1.click();
		Thread.sleep(2000);
		headers.register.click();
		Thread.sleep(1000);
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) throws Throwable {
		registerPage.enterData(dataTable, "unique");
		Thread.sleep(2000);
	}

	@And("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy() throws Throwable {
		registerPage.privacyPolicy.click();
		Thread.sleep(1000);
	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button() throws Throwable {
		registerPage.Continue.click();
		Thread.sleep(3000);

	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created() throws Throwable {

		Assert.assertTrue(accountSuccess.successBreadcrumb.isDisplayed());

	}


	@When("^I click on Continue button without providing anything into the mandatory fields$")
	public void i_click_on_Continue_button_without_providing_anything_into_the_mandatory_fields() throws Throwable {

		registerPage.Continue.click();
		Thread.sleep(3000);

	}

	@Then("^I should see that the User Account should not be created$")
	public void i_should_see_that_the_User_Account_should_not_be_created() throws Throwable {

		Assert.assertTrue(registerPage.registerBreadCrumb.isDisplayed());

	}

	@Then("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields() throws Throwable {

		Assert.assertTrue(registerPage.firstnameWarning.isDisplayed());
		Assert.assertTrue(registerPage.lastnameWarning.isDisplayed());
		Assert.assertTrue(registerPage.emailWarning.isDisplayed());
		Assert.assertTrue(registerPage.telephoneWarning.isDisplayed());
		Assert.assertTrue(registerPage.passwordWarning.isDisplayed());
		Assert.assertTrue(registerPage.policyWarning.isDisplayed());

	}

	@And("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter() throws Throwable {
		registerPage.newsLetter.click();
	}


	@When("^I provide the below duplicate details into the fields$")
	public void i_provide_the_below_duplicate_details_into_the_fields(DataTable dataTable) throws Throwable {
		registerPage.enterData(dataTable, "duplicate");
		Thread.sleep(2000);

	}

//	@Then("^I should see the warning message \"([^\"]*)\"$")
//	public void i_should_see_the_warning_message(String expected) throws Throwable {
//
//		Assert.assertEquals(registerPage.mainWarning, expected);
//	}


}
