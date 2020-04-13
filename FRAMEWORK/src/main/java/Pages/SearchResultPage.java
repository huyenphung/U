package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class SearchResultPage {

	public SearchResultPage() {
		PageFactory.initElements(testBase.driver, this);
		
	}
	@FindBy(xpath ="//*[@id='content']//div[@class='caption']//a")
	public static WebElement searchResult;

	@FindBy(xpath = "//*[@id='content']/p[2]")
	public static WebElement noResults;

}

