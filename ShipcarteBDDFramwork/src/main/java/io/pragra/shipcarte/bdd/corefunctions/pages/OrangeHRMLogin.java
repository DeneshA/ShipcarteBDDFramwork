package io.pragra.shipcarte.bdd.corefunctions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin {

    WebDriver driver;

    @FindBy(id="txtUsername")WebElement userName;
    @FindBy(id="txtPassword")WebElement password;
    @FindBy(id="btnLogin")WebElement loginButton;
    @FindBy(id="spanMessage")WebElement spanMessage;
    @FindBy(xpath = "//a[text()='Forgot your password?']") WebElement forgotPassword;

    public OrangeHRMLogin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUserName(String un){
        userName.clear();;
        userName.sendKeys(un);
    }
    public void enterPassword(String un){
        password.clear();;
        password.sendKeys(un);
    }
    public void click_Login_Button(){
        this.loginButton.click();
    }

    public void Click_Forgot_your_password(){
        this.forgotPassword.click();
    }

    public String isInvalidCredentials(){
        return spanMessage.getText();
    }

}
