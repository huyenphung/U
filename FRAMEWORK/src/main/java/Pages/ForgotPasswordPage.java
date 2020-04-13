package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class ForgotPasswordPage {

	public ForgotPasswordPage() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(xpath = "//*[@id='input-email']")
	public static WebElement emailField;

	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement continueBtn;
}
