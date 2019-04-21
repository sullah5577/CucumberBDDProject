package com.ninjastore.automation.pages;

import com.ninjastore.automation.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    public MyAccountPage(){
        PageFactory.initElements(Base.driver,this);
    }


    @FindBy(linkText = "Account")
    public static WebElement accountBreadCrum;
}
