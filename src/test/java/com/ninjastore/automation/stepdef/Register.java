package com.ninjastore.automation.stepdef;

import com.ninjastore.automation.pages.AccountSuccessPage;
import com.ninjastore.automation.pages.HeadersSection;
import com.ninjastore.automation.base.Base;
import com.ninjastore.automation.framework.Elements;
import com.ninjastore.automation.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import org.junit.Assert;


public class Register {

    HeadersSection headersSection = new HeadersSection();
    RegisterPage registerPage = new RegisterPage();
    AccountSuccessPage accountSuccessPage = new AccountSuccessPage();



    @Given("^I launch the application$")
    public void i_launch_the_application()  {
        Base.driver.get(Base.reader.getUrl());



    }

    @And("^I navigate to Account Registration page$")
    public void i_navigate_to_Account_Registration_page()  {
        Elements.click(HeadersSection.myAccountLink);
        Elements.click(HeadersSection.registerLink);

    }

    @When("^I provide all the below valid details$")
    public void i_provide_all_the_below_valid_details(DataTable dataTable) {
        RegisterPage.enterAllDetail(dataTable,"unique");



    }

    @And("^I select the privacy policy$")
    public void i_select_the_privacy_policy() {

        Elements.click(RegisterPage.privacyPolicySelect);

    }

    @And("^I click on continue button$")
    public void i_click_on_continue_button(){
        Elements.click(RegisterPage.continueBtn);

    }

    @Then("^I should see that the User Account has been successfully created$")
    public void i_should_see_that_the_User_Account_has_been_successfully_created()  {
       // Elements.VerifyTextEquals(RegisterPage.accountCreated,"Congratulations! Your new account has been successfully created!");
        Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successBreadCrumb));



    }

    @Then("^I should see that the User Account is not created$")
    public void i_should_see_that_the_User_Account_is_not_created()  {
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerBreadCrum));

    }

    @And("^I should see the error messages informing the user to fill the mandatory fields$")
    public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields(){
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstNameWarning));
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastNameWarning));
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailWarning));
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephoneWarning));
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordWarning));
        Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainWarning));

    }

    @And("^I subscribe to Newsletter$")
    public void i_subscribe_to_Newsletter(){
        Elements.click(RegisterPage.newsLetter);


    }

    @And("^I select the Privacy Policy$")
    public void i_select_the_Privacy_Policy(){
        Elements.click(RegisterPage.privacyPolicySelect);


    }

    @And("^I click on Continue button$")
    public void i_click_on_Continue_button(){


    }

    @Then("^I should see that the User Account has successfully created$")
    public void i_should_see_that_the_User_Account_has_successfully_created(){


    }

    @When("^I provide the below duplicate details into the fields$")
    public void i_provide_the_below_duplicate_details_into_the_fields(DataTable dataTable)  {

        RegisterPage.enterAllDetail(dataTable,"duplicate");

    }

    @Then("^I should see the warning message stating that the user is already created$")
    public void i_should_see_the_warning_message_stating_that_the_user_is_already_created() {

        Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainWarning,"Warning: E-Mail Address is already registered!"));


    }


}
