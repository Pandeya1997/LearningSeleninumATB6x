package com.thetestingacademy.winbuz_io;

import io.qameta.allure.Description;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;

public class login {
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
    @Description("Test Case Description  Releative locator ")
    public void testPositive() {
        try {
            driver.manage().window().maximize();
            String  URL = "https://winbuz.io/";
            driver.get(URL);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           WebElement loginTab = driver.findElement(By.xpath("// button [@data-target=\"#loginModal\"]"));
            loginTab.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            WebElement username = driver.findElement(By.xpath("//input  [@placeholder=\"Username\"]"));
           username.sendKeys("dcuser01");
           WebElement password = driver.findElement(By.xpath("//input  [@placeholder=\"Password\"]"));
           password.sendKeys("abcd12345");
           WebElement loginButton = driver.findElement(By.xpath("//button[@title ='Login']"));
           loginButton.click();
            actions = new Actions(driver);

        }catch (StaleElementReferenceException | NoSuchElementException e){
            System.out.println(e.getMessage());
        }
            try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            WebElement notficatinAlertOf = driver.findElement(By.xpath("// button [@class=\"btn cancel-but\"]"));
            notficatinAlertOf.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }



    @AfterTest
    public void closedBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
