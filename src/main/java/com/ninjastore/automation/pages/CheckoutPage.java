package com.ninjastore.automation.pages;

import com.ninjastore.automation.base.Base;
import com.ninjastore.automation.framework.Elements;
import com.ninjastore.automation.framework.Waits;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public CheckoutPage(){
        PageFactory.initElements(Base.driver,this);
    }

    @FindBy(id = "input-payment-firstname")
    public static WebElement billingFirstName;

    @FindBy(id = "input-payment-lastname")
    public static WebElement billingLastName;

    @FindBy(id = "input-payment-address-1")
    public static WebElement billingAddress;

    @FindBy(id = "input-payment-city")
    public static WebElement billingCity;

    @FindBy(id = "input-payment-postcode")
    public static WebElement billingPostCode;

    @FindBy(id = "input-payment-country")
    public static WebElement billingCountry;

    @FindBy(id = "input-payment-zone")
    public static WebElement billingZone;

    @FindBy(id = "button-payment-address")
    public static WebElement billingContinueBtn;

    @FindBy(id = "button-shipping-address")
    public static WebElement shippingContinueBtn;

    @FindBy(id = "button-shipping-method")
    public static WebElement deliveryMethodContinueBtn;

    @FindBy(css = "input[name='agree']")
    public static WebElement termsAndConditions;

    @FindBy(id = "button-payment-method")
    public static WebElement  paymentMethodContinueBtn;


    @FindBy(id = "button-confirm")
    public static WebElement placeOrder;

    @FindBy(linkText = "Success")
    public static WebElement orderSuccess;

    public static void enterBillingDetails(){

        Elements.TypeText(billingFirstName,Base.reader.getFname());
        Elements.TypeText(billingLastName,Base.reader.getLname());
        Elements.TypeText(billingAddress,Base.reader.getAddress());
        Elements.TypeText(billingCity,Base.reader.getCity());
        Elements.TypeText(billingPostCode,Base.reader.getPostCode());
        Elements.selectByValue(billingCountry,"223");
        Elements.selectByValue(billingZone,"3655");
    }

    public static void placeOrder(){

        Elements.click(billingContinueBtn);
        Elements.click(shippingContinueBtn);
        Elements.click(deliveryMethodContinueBtn);
        Elements.selectCheckBox(termsAndConditions);
        Elements.click(paymentMethodContinueBtn);
        Waits.waitUntilElementLocated(10,placeOrder);
        Elements.click(placeOrder);
    }

}
