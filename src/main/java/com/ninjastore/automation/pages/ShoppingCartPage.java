package com.ninjastore.automation.pages;

import com.ninjastore.automation.base.Base;
import com.ninjastore.automation.framework.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    public ShoppingCartPage(){
        PageFactory.initElements(Base.driver,this);
    }

    @FindBy(linkText = "Checkout")
    public static WebElement checkoutBtn;


    public static void navigateToCheckoutPage(){
        Elements.click(checkoutBtn);
    }
}
