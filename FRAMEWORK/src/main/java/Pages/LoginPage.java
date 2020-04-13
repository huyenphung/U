package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class LoginPage {

	public LoginPage() {

		PageFactory.initElements(testBase.driver, this);

	}

	@FindBy(xpath = "//*[@id='input-email']")
	public static WebElement emailLogin;

	@FindBy(xpath = "//*[@id='input-password']")
	public static WebElement passwordLogin;

	@FindBy(xpath = "//input[@value='Login']")
	public static WebElement loginBtn;

	@FindBy(css = "div[class$='alert-dismissible']")
	public static WebElement mainWarning;

	@FindBy(linkText = "Forgotten Password")
	public static WebElement forgotPassword;

	public static void doLogin(String email, String password) {

		emailLogin.sendKeys(email);
		passwordLogin.sendKeys(password);
		loginBtn.click();

	}



}
