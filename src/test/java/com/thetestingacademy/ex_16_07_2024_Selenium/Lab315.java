package com.thetestingacademy.ex_16_07_2024_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab315 {
    @Test
    public void testvwoNevigation(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

//        WebDriver  driver =  new EdgeDriver(edgeOptions);
//        driver.get("https://app.vwo.com");
//        System.out.println(driver.getTitle());
//        Assert.assertEquals(driver.getTitle(),"Login - VWO");
//        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
//        WebElement freeTrialLink = driver.findElement(By.partialLinkText("Start a free"));

        //       Default Locator Strategy - ID,  Name, Class - Unique - Super Good.
        // Xpath or CSS Selector Strategy
        //  Which is good, xpath or css Selector?
        //  Css Selectors -> little fast, Nowdays since more ram - xpath  == css selector
        // Xpath -> , css Seelctor -
        // 25Test - mixture, it depends - sometimes xpath easy -

        // Xpath or Css Selector - converted to each vice -
        // Css Selector - Css Engine - little fast to find the element

        // What is XPath?
        // XPath is a query language.
        // for selecting nodes from an XML document.
        // HTML -> xml type of document - tag based - A
        // XPath was defined by the World Wide Web Consortium.
        // All the major browsers understand and supports it. W3C

        // Type of Xpath

        // Absolute Xpath - Full Xpath - Type #1
        // /html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/form[1]/ul/li[1]/div/input
        // It is too long -
        // prone to change - any change in div or html - Axpath will  work
        // no BODY USe THIS


        // Relative Xpath (with Query)
        // Core Logic - //tagName[@attribute='value']
        // Selenium -id -?
        // || //input[@id="js-login-confirm-email


        WebDriver  driver =  new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());

        //WebElement btnElement_CN = driver.findElement(By.className("btn-lg"));
        // btnElement_CN.click();
        WebElement btnElement_ID = driver.findElement(By.id("btn-make-appointment"));
        btnElement_ID.click();


       try {
           Thread.sleep(3000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
        driver.quit();
    }

}
