package com.thetestingacademy.ex_11_07_2024_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab305 {
    @Test
    public void testvwoLoginTitle() {
       WebDriver driver = new EdgeDriver();
      //  driver.get("vwo.com"); // https mandatory
       driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();


    }
}
