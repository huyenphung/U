package Pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import cucumber.api.DataTable;

public class RegisterPage {
	public testBase testbase = new testBase();
	public RegisterPage() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(id = "input-firstname")
	public static WebElement firstName;

	@FindBy(id = "input-lastname")
	public static WebElement lastName;

	@FindBy(id = "input-email")
	public static WebElement email;

	@FindBy(id = "input-telephone")
	public static WebElement telephone;

	@FindBy(id = "input-password")
	public static WebElement password;

	@FindBy(id = "input-confirm")
	public static WebElement confirmPassword;

	@FindBy(name = "agree")
	public static WebElement privacyPolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	public static WebElement Continue;

	@FindBy(linkText = "Register")
	public static WebElement registerBreadCrumb;


	@FindBy(css = "input[id='input-firstname']+div")
	public static WebElement firstnameWarning;

	@FindBy(css = "input[id='input-lastname']+div")
	public static WebElement lastnameWarning;

	@FindBy(css = "input[id='input-email']+div")
	public static WebElement emailWarning;

	@FindBy(css = "input[id='input-telephone']+div")
	public static WebElement telephoneWarning;

	@FindBy(css = "input[id='input-password']+div")
	public static WebElement passwordWarning;

	@FindBy(xpath = "//*[@id=\"account-register\"]/div[1]")
	public static WebElement policyWarning;

	@FindBy(xpath = "//input[@name='newsletter'][1]")
	public static WebElement newsLetter;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']/text()")
	public static WebElement mainWarning;

//	public void newLetter() {
//		boolean check = false;
//		List<WebElement> radiobtn = testbase.driver.findElements(By.name("newsletter"));
//		for (int element = 0; element < radiobtn.size() - 1; element++) {
//			check = radiobtn.get(element).isSelected();
//
//			if (!check) {
//				radiobtn.get(element).click();
//				}}}

	public static void enterData(DataTable dataTable, String detailsType) throws InterruptedException {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
//		Elements.typeText(RegisterPage.firstName, map.get("FirstName"));
//		Elements.typeText(RegisterPage.lastName, map.get("FirtsName"));
//		Elements.typeText(RegisterPage.email, System.currentTimeMillis() + map.get("Email"));
//		Elements.typeText(RegisterPage.telephone, map.get("Telephone"));
//		Elements.typeText(RegisterPage.password, map.get("Password"));
//		Elements.typeText(RegisterPage.confirmPassword, map.get("Password"));

		firstName.sendKeys(map.get("FirstName"));
		lastName.sendKeys(map.get("LastName"));
		telephone.sendKeys(map.get("Telephone"));
		password.sendKeys(map.get("Password"));
		confirmPassword.sendKeys(map.get("Password"));

		if (detailsType.equalsIgnoreCase("duplicate")) {
			email.sendKeys(map.get("Email"));
		} else {
			email.sendKeys(System.currentTimeMillis() + map.get("Email"));
		}

	}



}
