package com.thetestingacademy.ex_20_07_2024_selenium_Wait;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.thetestingacademy.ex_20_07_2024_selenium_Wait.WaitHelpers.CheckVisibility;

public class Lab322 {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testVerifyFREETrial() throws InterruptedException {

        // Explicit Wait


        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        driver.findElement(By.id("login-username")).sendKeys("contact+atb7x@thetestingacademy.com");
        driver.findElement(By.id("login-password")).sendKeys("Wingify@1234");
        driver.findElement(By.id("js-login-btn")).click();

        // Wait to Dashboard to Load
        CheckVisibility(driver,(By.cssSelector("[data-qa='lufexuloga']")));

        WebElement loggedin_username = driver.findElement(By.cssSelector("[data-qa='lufexuloga']"));
        System.out.println("Logged in user details --> " + loggedin_username.getText());
        Assert.assertTrue(loggedin_username.getText().contains("Aman Ji"));

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
