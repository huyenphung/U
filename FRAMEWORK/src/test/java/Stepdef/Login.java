package Stepdef;

import org.junit.Assert;

import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.headersPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login {

	headersPage headers = new headersPage();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();

	@Given("^I navigate to Account Login page$")
	public void i_navigate_to_Account_Login_page() throws Throwable {
		headers.myAccountLink.click();
		Thread.sleep(2000);
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

}
