package com.thetestingacademy.Action_Window_Drag_Drop;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Lab342 {

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
           String  URL = "https://maps.google.com/m";
           driver.get(URL);
           WebElement ele = driver.findElement(By.xpath("//*[@class=\"gLFyf\"]"));
           driver.navigate().refresh();
           ele.sendKeys("Asrrsol");
           ele.sendKeys(Keys.ENTER);
           // Refresh , Nevagited other page , change in DOM elements(Ajax calls) - VueJS, AngularJS

           //  driver.switchTo().frame(0); Exception in thread "main" org.openqa.selenium.NoSuchFrameException: No frame element found
// driver.switchTO().alert().accept();  Exception in thread "main" org.openqa.selenium.NoAlertPresentException: No alert is present.
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }catch (StaleElementReferenceException | NoSuchElementException e){
           System.out.println(e.getMessage());
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
