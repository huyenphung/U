package Stepdef;

import Pages.SearchResultPage;
import Pages.headersPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Search {
	headersPage headers = new headersPage();
	SearchResultPage searchResult = new SearchResultPage();

	@When("^I search for a product say \"([^\"]*)\"$")
	public void i_search_for_a_product_say(String product) throws Throwable {
		headers.searchKeyword.sendKeys(product);
		headers.searchbtn.click();

	}

	@Then("^I should see the product in the search results$")
	public void i_should_see_the_product_in_the_search_results() throws Throwable {
		Assert.assertTrue(searchResult.searchResult.isDisplayed());

	}

	@Then("^I should see the page displaying the message \"([^\"]*)\"$")
	public void i_should_see_the_page_displaying_the_message(String expected) throws Throwable {
		Assert.assertEquals(expected, searchResult.noResults);

	}

}
