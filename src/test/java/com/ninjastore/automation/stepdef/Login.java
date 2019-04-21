package com.ninjastore.automation.stepdef;

import com.ninjastore.automation.pages.*;
import com.ninjastore.automation.framework.Elements;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class Login {


    HeadersSection headersSection = new HeadersSection();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage();


    @And("^I navigate to Account Login page$")
    public void i_navigate_to_account_login_page() {
        Elements.click(HeadersSection.myAccountLink);
        Elements.click(HeadersSection.login);

    }

    @When("^I login to the application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void i_login_to_the_application_using_username_something_and_password_something(String Username, String Password){

        LoginPage.doLogin(Username, Password);
    }

    @Then("^I should see that the User is able to successfully login$")
    public void i_should_see_that_the_user_is_able_to_successfully_login() {

        Assert.assertTrue(Elements.isDisplayed(MyAccountPage.accountBreadCrum));

    }






    @Then("^I should see an error message informing the User about invalid credentials$")
    public void i_should_see_an_error_message_informing_the_user_about_invalid_credentials() {
        Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning,"Warning: No match for E-Mail Address and/or Password."));

    }

    @When("^I reset the forgotten password for \"([^\"]*)\"$")
    public void i_reset_the_forgotten_password_for(String email)  {
        Elements.click(LoginPage.forgotPasswordLink);
        Elements.TypeText(ForgottenPasswordPage.emailField,email);
        Elements.click(ForgottenPasswordPage.continueBtn);

    }

    @Then("^I should see a message informing that the password reset details have been sent to the email address$")
    public void i_should_see_a_message_informing_that_the_password_reset_details_have_been_sent_to_the_email_address()  {
        Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainWarning,"An email with a confirmation link has been sent your email address."));

    }





}
