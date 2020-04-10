package FrameWork;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import Base.testBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static Logger log = Logger.getLogger(Browser.class);

	public static WebDriver startBrowser() {
		String browser = testBase.reader.getBrowser().toLowerCase();
		log.info("Selected Browser is: "+browser);
		switch (browser) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			testBase.driver = new ChromeDriver();
			log.info("Chrome Browser is Started" + testBase.driver.hashCode());
			return testBase.driver;

		case "ie":
			WebDriverManager.iedriver().setup();
			testBase.driver = new InternetExplorerDriver();
			log.info("Internet Explorer Browser is Started" + testBase.driver.hashCode());
			return testBase.driver;

		case "opera":
			WebDriverManager.operadriver().setup();
			testBase.driver = new OperaDriver();
			log.info("Opera Browser is Started" + testBase.driver.hashCode());
			return testBase.driver;

		case "htmlunit":
			testBase.driver = new HtmlUnitDriver();
			log.info("HtmlUnit Browser is Started" + testBase.driver.hashCode());
			return testBase.driver;

		default:
			WebDriverManager.firefoxdriver().setup();
			testBase.driver = new FirefoxDriver();
			log.info("Firefox Browser is Started" + testBase.driver.hashCode());
			return testBase.driver;
		}

	}

	public static void maximize() {
		testBase.driver.manage().window().maximize();
	}

	public static byte[] takeScreenshot() {
		try {
			return ((TakesScreenshot) testBase.driver).getScreenshotAs(OutputType.BYTES);
		}
		catch(Exception e){
			log.info("Exception has Occured while taking screenshot");
			return null;
		}

		

	}
}
