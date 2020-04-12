package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = { "@Login",
				"@1" },
		features = "classpath:FeatureFiles/Login.feature", glue = "classpath:Stepdef", plugin = {
				"json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html",
				"html:target/cucumber_html_report" })

public class Runner {


}
