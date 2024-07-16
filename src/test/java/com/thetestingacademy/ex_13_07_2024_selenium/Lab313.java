package com.thetestingacademy.ex_13_07_2024_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab313 {
    @Test
    public void testVwoLoginNegative() {
        // Project #1 TC (Negative) - invalid username pass message
        //
        // 1. open the url .app vwo.com/#/login](https://app.vwo.com/#/login)
        // 2. Find the email id** and enter the email as admin@admin.com
        //3. find the pass inputbox** and enter password as admin
        //4. Find and click on the submit button
        //5. verify that the error message is shown "your email , password ip address or location "

        // how the find the element
        // email id
        // < input
        // type = "email"
        // class = "text-input W(100%)"
        // name = "username"
        // id = "login-username"
        // data -qa = "hocewoqisi"
        // >
// Find the email id  and enter the email as admin@admin.com
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver  driver = new EdgeDriver(edgeOptions);

        driver.get("https://app.vwo.com");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        // Actual result = excepted results

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


//        WebElement freeTrialLink = driver.findElement(By.linkText("Start a free trial"));
//freeTrialLink.click();
        // or pratical use text
        WebElement freeTrialLink = driver.findElement(By.partialLinkText("Start a free"));
        freeTrialLink.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
