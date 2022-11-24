package com.vyTrack.pages;

import com.vyTrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US1_page extends BasePage {
public US1_page(){
    PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy(xpath = "//ul[contains(@class,'nav-multilevel')]/li")
public WebElement mainModules;
}
