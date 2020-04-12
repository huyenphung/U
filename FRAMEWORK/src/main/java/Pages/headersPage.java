package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class headersPage {

	public headersPage() {
		PageFactory.initElements(testBase.driver, this);
	}

	public WebElement myAccountLink() {
		WebElement myAccountLink = testBase.driver.findElement(By.xpath("//span[text()='My Account']"));
		return myAccountLink;
	}
@FindBy(xpath = "//span[text()='My Account']")
public static WebElement myAccountLink1;

	@FindBy(xpath="//a[text() = 'Register']")
	public static WebElement register;

}
