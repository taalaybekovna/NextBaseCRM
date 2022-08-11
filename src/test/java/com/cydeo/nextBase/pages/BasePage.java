package com.cydeo.nextBase.pages;

import com.cydeo.nextBase.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    /** 0. Global objects: */
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15 );



    //------------------------------------------------------------//
    /** 1. Initialization of this page */
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
