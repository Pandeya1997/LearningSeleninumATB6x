package com.thetestingacademy.ex_Sdom_JavaScript;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class Lab331 {
  EdgeDriver driver;

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


        driver.get("https://selectorshub.com/xpath-practice-page/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
       try {
           Thread.sleep(5000);
       }catch (InterruptedException e){
           throw new RuntimeException(e);
       }
//        JavascriptExecutor JS = (JavascriptExecutor) driver;
//       JS.executeScript("alert(1)");
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }-
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // //div[@class='jackPart']
        //div[@id='userName']
        WebElement divScrollTo = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);",divScrollTo);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

// JavaScriptcode --> "document.querySelector("div#userName").shadowRoot.querySelector("div").shadowRoot.querySelector("#pizza")"
// document.querySelector("div#userName").shadowRoot.querySelector("div").shadowRoot.querySelector("#pizza")

        WebElement inputboxt = (WebElement) js.executeScript(" return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div\").shadowRoot.querySelector(\"#pizza\")");
        inputboxt.sendKeys("FarmHouse");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }











//        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
//        driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
//        driver.findElement(By.id("js-login-btn")).click();
//
//
//        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
//        wait.until(ExpectedConditions.textToBePresentInElement(error_msg,"Your email, password, IP address or location did not match"));
//
//        Assert.assertEquals(error_msg.getText(), "Your email, password, IP address or location did not match");


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
