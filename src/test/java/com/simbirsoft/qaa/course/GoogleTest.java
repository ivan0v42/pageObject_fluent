package com.simbirsoft.qaa.course;

import com.simbirsoft.qaa.course.pageObjects.methods.GoogleMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GoogleTest {

    final String str="google";
    private WebDriver driver;
    private GoogleMainPage pageSearch;
    private String valueField;

    @BeforeMethod
    public void beforeMethod() {
       // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
        
        driver = new ChromeDriver();
    }

    @Test
    public void searchTest() throws Exception {

        pageSearch = new GoogleMainPage(driver);
        valueField = pageSearch.openPage().waitInputElement().fillSearchField(str).getValueField();
        pageSearch.checkValue(valueField);

    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}
