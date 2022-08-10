package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    /** 0. Global objects: */
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15 );



    //------------------------------------------------------------//
    /** 1. Initialization of this page */
    public Base(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
