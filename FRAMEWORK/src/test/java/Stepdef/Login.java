package Stepdef;


import Pages.ForgotPasswordPage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.headersPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class Login {

	headersPage headers = new headersPage();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	ForgotPasswordPage forGotPassword = new ForgotPasswordPage();

	@Given("^I navigate to Account Login page$")
	public void i_navigate_to_Account_Login_page() throws Throwable {

		headers.myAccountLink.click();

		headers.login.click();
	}

	@When("^I login to the application using username as \"([^\"]*)\" and valid password as \"([^\"]*)\"$")
	public void i_login_to_the_application_using_username_as_and_valid_password_as(String email, String password)
	{
		loginPage.doLogin(email, password);
	}

	@Then("^I should see that the User should be able to successfully login$")
	public void i_should_see_that_the_User_should_be_able_to_successfully_login() {

		Assert.assertTrue(myAccountPage.registerAffiliateaccount.isDisplayed());

	}

//	@Then("^I should see an error message \"([^\"]*)\"$")
//	public void i_should_see_an_error_message(String expected) throws Throwable {
//		Assert.assertEquals(expected, loginPage.mainWarning);
//	}
//	

	@When("^I reset the forgoten password for the email address \"([^\"]*)\"$")
	public void i_reset_the_forgoten_password_for_the_email_address(String email) throws Throwable {

		loginPage.forgotPassword.click();
		forGotPassword.emailField.sendKeys(email);
		forGotPassword.continueBtn.click();
	}


	@Then("^I should see a message \"([^\"]*)\"$")
	public void i_should_see_a_message(String expected) throws Throwable {
		Assert.assertEquals(expected, loginPage.mainWarning);
	}

}
