package com.thetestingacademy.Action_Window_Drag_Drop;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Lab338 {

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
       String  URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        WebElement spanElement = driver.findElement(By.xpath("//span[.='Years of Experience']"));
        driver.findElement(with(By.id("exp-3")).toRightOf(spanElement)).click();


        try {
            Thread.sleep(5000);
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
