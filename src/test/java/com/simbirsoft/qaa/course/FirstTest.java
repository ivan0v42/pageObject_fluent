package com.simbirsoft.qaa.course;

import com.simbirsoft.qaa.course.helpers.CopyPaste;
import com.simbirsoft.qaa.course.pageObjects.methods.ClipboardjsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * Created by artem on 15.11.2018.
 */
public class FirstTest {
    private String valueField;
    private WebDriver driver;


    private ClipboardjsPage clipboardjsPage;


    @BeforeMethod
        public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        }
       @Test
        public void test() throws Exception {
            clipboardjsPage = new ClipboardjsPage(driver);

            valueField = clipboardjsPage
                    .openPage()
                    .waitInputElement()
                    .waitButtonElement()
                    .toClick()
                    .getValueField();
            clipboardjsPage.checkValue(valueField);





        }

        @AfterMethod
        public void after() {
            driver.quit();
        }
}

