package com.thetestingacademy.VIC9;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationVIC {
    @Test
    public void testNavigation(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("guest");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://victoryexch9.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Victoryexch9");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://victoryexch9.com/");
        WebElement Button_login = driver.findElement(By.xpath("//button [@data-target = '#loginModal']"));
        Button_login.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement input_Username = driver.findElement(By.xpath("//input [@placeholder = 'Username']"));
        input_Username.sendKeys("soumya102");

        // Enter  User name  and password with sumbit button clicks

        WebElement input_password = driver.findElement(By.xpath("//input [@placeholder= 'Password']"));
        input_password.sendKeys("Abcd1234");

        WebElement button_login = driver.findElement(By.xpath("//button [@title= 'Login']"));
        button_login.click();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
