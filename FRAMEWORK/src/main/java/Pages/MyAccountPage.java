package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class MyAccountPage {

	public MyAccountPage() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(linkText = "Register for an affiliate account")
	public static WebElement registerAffiliateaccount;

}
