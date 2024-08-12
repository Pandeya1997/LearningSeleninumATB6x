package com.thetestingacademy.Action_Window_Drag_Drop;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Lab341 {

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
       String  URL = "https://codepen.io/AbdullahSajjad/full/LYGVRgK";
        driver.get(URL);
     driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().frame("result");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //form [@id ='form']/button["submit"]
      WebElement button = driver.findElement(By.xpath("//form [@id ='form']/button[1]"));
        button.click();

        //input  [@id="username"]
        WebElement element = driver.findElement(By.xpath("//input [@id='username']"));
       WebElement errorElement = driver.findElement(with(By.tagName("small")).below(element));
      String errorText = errorElement.getText();
      Assert.assertTrue(errorElement.isDisplayed());
        Assert.assertEquals(errorText,"Username must be at least 3 characters");

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
