package com.ninjastore.automation.pages;

import com.ninjastore.automation.base.Base;
import com.ninjastore.automation.framework.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadersSection  {

    public HeadersSection(){
        PageFactory.initElements(Base.driver,this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    public static WebElement myAccountLink;

    @FindBy(xpath = "//a[text()='Register']")
    public static WebElement registerLink;

    @FindBy(linkText = "Login")
    public static WebElement login;

    @FindBy(name = "search")
    public static WebElement searchField;

    @FindBy(css = "i[class$='fa-search']")
    public static WebElement searchBtn;

    @FindBy(xpath = "//span[text()='Shopping Cart']")
    public static WebElement shoppingCart;


    public static void navigateToLoginPage(){
        Elements.click(myAccountLink);
        Elements.click(login);
    }

    public static void navigateToShoppingCartPage(){
        Elements.click(shoppingCart);
    }

    public static void searchForProduct(){
        Elements.TypeText(searchField,Base.reader.getProduct());
        Elements.click(searchBtn);
    }





}
