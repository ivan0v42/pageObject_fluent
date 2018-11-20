package com.simbirsoft.qaa.course.pageObjects.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by artem on 20.11.2018.
 */
public class ClipboardjsLocators {
    protected WebDriver driver;
    protected By inputElementlocator = By.id("foo");
    protected By buttonElementLocator = By.xpath("//*[@id=\"example-target\"]//button");

    public ClipboardjsLocators(WebDriver driver){
        this.driver=driver;
    }
}
