package com.simbirsoft.qaa.course.pageObjects.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by artem on 19.11.2018.
 */
public class GoogleMainLocators {
    protected WebDriver driver;

    protected By searchInputElement = By.name("q");

    public GoogleMainLocators(WebDriver driver){
        this.driver=driver;
    }

}
