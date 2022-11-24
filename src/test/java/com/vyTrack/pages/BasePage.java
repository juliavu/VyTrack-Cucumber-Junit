package com.vyTrack.pages;

import com.vyTrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
        public BasePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//input[@id='prependedInput']")
public WebElement userName;

@FindBy(xpath = "//input[@id='prependedInput2']")
public WebElement passWord;

@FindBy (id="_submit")
public WebElement logInBtn;


}
