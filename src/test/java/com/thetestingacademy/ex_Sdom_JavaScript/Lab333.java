package com.thetestingacademy.ex_Sdom_JavaScript;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab333 {
  EdgeDriver driver;
    private Actions actions;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Test Case Description -  Shadom")
    public void testVerifyFREETrial()  {

        // Explicit Wait


        driver.get("https://www.spicejet.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

// x-Path -->  //div[@data-testid='search-source-code']

WebElement from = driver.findElement(By.xpath("//div[@data-testid='search-source-code']"));
from.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
