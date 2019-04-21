package com.ninjastore.automation.stepdef;

import com.ninjastore.automation.framework.Elements;
import com.ninjastore.automation.pages.HeadersSection;
import com.ninjastore.automation.pages.SearchResultsPage;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class Search {


    HeadersSection headersSection = new HeadersSection();
    SearchResultsPage searchResultsPage = new SearchResultsPage();


    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String product){

        Elements.TypeText(HeadersSection.searchField,product);
        Elements.click(HeadersSection.searchBtn);

    }

    @Then("^I should see the product in the search results$")
    public void i_should_see_the_product_in_the_search_results() {
        Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.samsungSyncMasterProduct));

    }

    @Then("^I should see the page displaying the message \"([^\"]*)\"$")
    public void i_should_see_the_page_displaying_the_message(String message){
        Assert.assertTrue(Elements.VerifyTextEquals(SearchResultsPage.searchResultMessage,message));


    }
}
