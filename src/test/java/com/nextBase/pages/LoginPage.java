package com.nextBase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

//Given I am on "Authorization" Page


        // https://login2.nextbasecrm.com/auth/?backurl=%2Fstream%2F
        public class Login2NextbasecrmAuthPage {

        }
        //When I input helpdesk correct username
        @FindBy(xpath = "//input[@type='text']")
        public WebElement userLogin;

        //And I input helpdesk correct password
        @FindBy(xpath = "//input[@type='password']")
        public WebElement userPassword;

        //And I click Login button
        @FindBy(xpath = "//input[@type='submit']")
        public WebElement loginBtn;

//public nextBaseCRM () {
//PageFactory.initElements(Driver, WebDriver Driver this);
    }

