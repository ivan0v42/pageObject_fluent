package com.simbirsoft.qaa.course.pageObjects.methods;

import com.simbirsoft.qaa.course.helpers.CopyPaste;
import com.simbirsoft.qaa.course.pageObjects.locators.GoogleMainLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by artem on 19.11.2018.
 */
public class GoogleMainPage extends GoogleMainLocators {

    private CopyPaste copyPaste;

    public GoogleMainPage(WebDriver driver) {
        super(driver);
    }

    public GoogleMainPage openPage() {
        driver.get("http://www.google.com");
        return this;
    }

    public GoogleMainPage fillSearchField(String str) {
        copyPaste = new CopyPaste();
        copyPaste.copy(str);
        driver.findElement(searchInputElement).sendKeys(Keys.CONTROL + "v");
        return this;
    }

    public GoogleMainPage waitInputElement() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable((this.searchInputElement)));
        return this;
    }

    public String getValueField() {
       return driver.findElement(searchInputElement).getAttribute("value");
    }

    public void checkValue(String value) {
        try {
            Assert.assertEquals(copyPaste.get(), value, "Строки не равны");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
