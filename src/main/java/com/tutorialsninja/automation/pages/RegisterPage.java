package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class RegisterPage {

    public RegisterPage(){
        PageFactory.initElements(Base.driver,this);
    }


    @FindBy(id = "input-firstname")
    public static WebElement firstName;

    @FindBy(id = "input-lastname")
    public static WebElement lastName;

    @FindBy(id = "input-email")
    public static WebElement emailAddress;

    @FindBy(id = "input-telephone")
    public static WebElement telephoneNumber;

    @FindBy(id = "input-password")
    public static WebElement password;

    @FindBy(id = "input-confirm")
    public static WebElement passwordConfirm;

    @FindBy(name = "agree")
    public static WebElement privacyPolicy;

    @FindBy(xpath = "//input[@value='Continue']")
    public static WebElement continueBtn;

    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your new account has been successfully created!')]")
    public static WebElement accountCreated;

    @FindBy(linkText = "Register")
    public static WebElement registerBreadCrum;

    @FindBy(css = "input[id='input-firstname']+div")
    public static WebElement firstNameWarning;

    @FindBy(css = "input[id='input-lastname']+div")
    public static WebElement lastNameWarning;

    @FindBy(css = "input[id='input-email']+div")
    public static WebElement emailWarning;

    @FindBy(css = "input[id='input-telephone']+div")
    public static WebElement telephoneWarning;

    @FindBy(css = "input[id='input-password']+div")
    public static WebElement passwordWarning;

    @FindBy(css = "div[class$='alert-dismissible']")
    public static WebElement mainWarning;

    @FindBy(css = "input[name='newsletter'][value='1']")
    public static WebElement newsLetter;

    @FindBy(css = "input[name='agree'][value='1']")
    public static WebElement privacyPolicySelect;

    public static void enterAllDetail(DataTable dataTable){
        Map<String,String> map =  dataTable.asMap(String.class,String.class);
        Elements.TypeText(firstName,map.get("FirstName"));
        Elements.TypeText(lastName,map.get("LastName"));
        Elements.TypeText(emailAddress,System.currentTimeMillis()+map.get("Email"));
        Elements.TypeText(telephoneNumber,map.get("Telephone"));
        Elements.TypeText(password,map.get("Password"));
        Elements.TypeText(passwordConfirm,map.get("Password"));
    }

    public static void verifyManditoryWarnings(){

    }

}
