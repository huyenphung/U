package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class headersPage {

	public headersPage() {
		PageFactory.initElements(testBase.driver, this);
	}

//	public WebElement myAccountLink() {
//		WebElement myAccountLink = testBase.driver.findElement(By.xpath("//span[text()='My Account']"));
//		return myAccountLink;
//	}
@FindBy(xpath = "//span[text()='My Account']")
public static WebElement myAccountLink;

	@FindBy(xpath="//a[text() = 'Register']")
	public static WebElement register;

	@FindBy(xpath = "//a[text()='Login']")
	public static WebElement login;

	@FindBy(xpath = "//*[@id='search']/input[@name='search']")
	public static WebElement searchKeyword;

	@FindBy(xpath = "//*[@id='search']//span//button")
	public static WebElement searchbtn;

}
