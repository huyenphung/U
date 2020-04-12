package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class AccountSuccessPage {
	public AccountSuccessPage() {

		PageFactory.initElements(testBase.driver, this);
	}


@FindBy(linkText = "Success")
public static WebElement successBreadcrumb;


}
