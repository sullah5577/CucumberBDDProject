package com.ninjastore.automation.stepdef;

import com.ninjastore.automation.base.Base;

import com.ninjastore.automation.framework.Browser;
import com.ninjastore.automation.framework.Elements;
import com.ninjastore.automation.pages.*;
import cucumber.api.java.en.*;
import org.junit.Assert;


public class Orders {

    HeadersSection headersSection = new HeadersSection();
    LoginPage loginPage = new LoginPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("^I login to the application$")
    public void i_login_to_the_application() throws Throwable {

        Browser.openApplicationUrl();
        HeadersSection.navigateToLoginPage();
        LoginPage.logIntoAccount();



    }

    @When("^I add any product to Bag and checkout$")
    public void i_add_any_product_to_Bag_and_checkout() {


        HeadersSection.searchForProduct();
        Elements.click(SearchResultsPage.addToCart);
        HeadersSection.navigateToShoppingCartPage();
        ShoppingCartPage.navigateToCheckoutPage();


    }

    @And("^I place an order$")
    public void i_place_an_order() {

       CheckoutPage.placeOrder();
       
    }

    @Then("^I should see that the order is placed successfully$")
    public void i_should_see_that_the_order_is_placed_successfully() {

        Assert.assertTrue(Elements.isDisplayed(CheckoutPage.orderSuccess));
    }


}