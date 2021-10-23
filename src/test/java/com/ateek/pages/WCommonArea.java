package com.ateek.pages;

import com.ateek.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class WCommonArea {

    @FindBy(id = "ctl00_logout")
    public WebElement logoutLink ;

    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrderTab ;

    @FindBy(linkText = "View all products")
    public WebElement viewAllProductTab ;

    @FindBy(linkText = "Order")
    public WebElement orderTab ;

    @FindBy(xpath = "//tr//ul[@id='ctl00_menu']/li") // -> at the end, add index[]
    public WebElement sideBarDynamic;

    public WCommonArea(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}


