package com.thetestingacademy.VWO_Project_1_Autmo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

//[Assignment] - Automating the Login Page of VWO.com
//Fetch the locators - https://app.vwo.com/
//Create a Maven project and add TestNG.
//Add the Allure Report (Allure TestNG)
//Automate the two Test cases of VWO.com
//Valid Username and Valid Password
//Verify name on dashboard page.
//Run them and share results.
//Push the code to github.com
//Git repo - ReadMe.md a Screen shot of allure.
public class AWOProject1 {
    @Test

    public void testNavigativation () {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl (),"https://app.vwo.com/#/login");

        WebElement emailInputBox =  driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passInputBox = driver.findElement(By.id("login-password"));
        passInputBox.sendKeys("password@321");


        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        // verfiy the error message
        //  WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(), "Your email, password, IP address or location did not match");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        // Actual result = excepted results


//        WebElement freeTrialLink = driver.findElement(By.linkText("Start a free trial"));
//freeTrialLink.click();
        // or pratical use text
        WebElement freeTrialLink = driver.findElement(By.partialLinkText("Start a free"));
        freeTrialLink.click();

        WebElement enterEmail = driver.findElement(By.id("page-v1-step1-email"));
        enterEmail.sendKeys("admin@admin.com");


        WebElement gdprConsentCheckbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        gdprConsentCheckbox.click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg_email_exist = driver.findElement(By.className("invalid-reason"));
        System.out.println(error_msg_email_exist.getText());

       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        driver.quit();

    }
}
