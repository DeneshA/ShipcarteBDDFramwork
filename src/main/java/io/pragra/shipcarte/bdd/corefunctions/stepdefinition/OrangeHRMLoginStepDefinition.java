package io.pragra.shipcarte.bdd.corefunctions.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.pragra.shipcarte.bdd.corefunctions.pages.OrangeHRMLogin;
import  io.pragra.shipcarte.bdd.corefunctions.pages.*;
import io.pragra.shipcarte.bdd.corefunctions.config.FrameworkPropertyConfig;
import io.pragra.shipcarte.bdd.corefunctions.drivermanager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginStepDefinition {

    WebDriver driver = null;
    OrangeHRMLogin orangeHRMLogin=null;

    @Before
    public void driverSetup(){
        this.driver = DriverManager.getInstance();
        System.out.println("Driver instence created");
        //this.driver.get(FrameworkPropertyConfig.getProperty("AppURL"));
    }

    @Given("OrangeHRM login page launched")
    public void Orange_login_pange_launched() {
        this.driver.get(FrameworkPropertyConfig.getProperty("AppURL"));
        orangeHRMLogin = new OrangeHRMLogin(driver);
        this.driver.manage().window().maximize();
        System.out.println("accessed the property file");
    }

    @When("User enter UserName and password")
    public void user_enter_valid_crediential() {

        orangeHRMLogin.enterUserName("Admin");
        orangeHRMLogin.enterPassword("admin123");
        System.out.println("Entered User name & Password");

    }

    @Then("Clicks on login button")
    public void click_on_login_button() {

        orangeHRMLogin.click_Login_Button();
        System.out.println("Preformed Button Clicked");

    }

    @Then("Should be landed in OrangeHRm dashboard")
    public void should_Be_Landed_In_Orange_HRM_Dashboard() {

        boolean linkStatus = driver.findElement(By.linkText("Welcome James")).isDisplayed();
        Assert.assertTrue(linkStatus);
        System.out.println("Verified landing page");
    }
}