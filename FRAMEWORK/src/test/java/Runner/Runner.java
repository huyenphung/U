package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = { "@Register",
				"@4" },
		features = "classpath:FeatureFiles/Register.feature", glue = "classpath:Stepdef", plugin = {
				"json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html",
				"html:target/cucumber_html_report" })

public class Runner {


}
