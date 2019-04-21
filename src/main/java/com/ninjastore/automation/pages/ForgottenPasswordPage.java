package com.ninjastore.automation.pages;

import com.ninjastore.automation.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPasswordPage {

    public ForgottenPasswordPage(){
        PageFactory.initElements(Base.driver,this);
    }

    @FindBy(id = "input-email")
    public static WebElement emailField;


    @FindBy(css = "input[type='submit'][value='Continue']")
    public static WebElement continueBtn;


}
