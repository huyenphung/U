package Stepdef;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import Base.testBase;
import Config.PropertyFileReader;
import FrameWork.Browser;
import Util.PathHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private static Logger log = Logger.getLogger(Hooks.class);
	
	@Before
	public void setUp(Scenario scenario){
	PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
	log.info("Scenario Started: "+scenario.getName());
	testBase.reader = new PropertyFileReader();
	Browser.startBrowser();
	Browser.maximize();
}



@After
	public void closeBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.embed(Browser.takeScreenshot(), "image/png");
		}
		log.info("Scenario Completed: " + scenario.getName());
		log.info("Scenario Status is: " + scenario.getStatus());
		testBase.driver.quit();
	}
}