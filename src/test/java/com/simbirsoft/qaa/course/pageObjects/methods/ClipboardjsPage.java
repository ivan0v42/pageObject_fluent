package com.simbirsoft.qaa.course.pageObjects.methods;

import com.simbirsoft.qaa.course.helpers.CopyPaste;
import com.simbirsoft.qaa.course.pageObjects.locators.ClipboardjsLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by artem on 20.11.2018.
 */
public class ClipboardjsPage  extends ClipboardjsLocators  {

    private CopyPaste copyPaste;

    public ClipboardjsPage(WebDriver driver) {
        super(driver);

    }

    public ClipboardjsPage openPage() {
        driver.get("https://clipboardjs.com/");
        return this;
    }



    public ClipboardjsPage waitButtonElement() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(this.buttonElementLocator));
        return this;
    }

    public ClipboardjsPage waitInputElement() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(this.inputElementlocator));
        return this;
    }

    public String getValueField() {
        return driver.findElement(inputElementlocator).getAttribute("value");
    }

    public void checkValue(String value) {
        try {
            Assert.assertEquals(copyPaste.get(), value, "Строки не равны");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ClipboardjsPage toClick() {
        driver.findElement(buttonElementLocator).click();
        return new ClipboardjsPage(driver);
    }
}
