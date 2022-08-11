package com.cydeo.nextBase.step_definitions;


import com.cydeo.nextBase.utilities.ConfigurationReader;
import com.github.javafaker.Faker;

import com.cydeo.nextBase.pages.BasePage;
import com.cydeo.nextBase.pages.LoginPage;
import com.cydeo.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class US01_step_def {

    /** Global objects: */
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();


    @Given("I am on Authorization Page")
    public void i_am_on_authorization_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("I input helpdesk correct username")
    public void i_input_helpdesk_correct_username() {
        loginPage.userLogin.sendKeys(ConfigurationReader.getProperty("userLogin"));
        loginPage.userPassword.sendKeys(ConfigurationReader.getProperty("userPassword"));
        loginPage.loginBtn.click();

    }

    @Then("I should navigate to Helpdesk home page")
    public void i_should_navigate_to_helpdesk_home_page() {

        String expectedURL= "nextbasecrm";
        wait.until(ExpectedConditions.urlContains("nextbasecrm"));

        String actualURL =Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("helpdesk is not appeared on URL",actualURL.contains(expectedURL));   // verification

    }



    @When("I input helpdesk correct username and password")
    public void i_input_helpdesk_correct_username_and_password() {
        loginPage.userLogin.sendKeys(ConfigurationReader.getProperty("userLogin2"));
        loginPage.userPassword.sendKeys(ConfigurationReader.getProperty("userPassword2"));
        loginPage.loginBtn.click();
    }




}

