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

import java.util.Set;


public class Lab336 {

    EdgeDriver driver;
    private Actions actions;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive(){
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

       String mainWindowHandle = driver.getWindowHandle();
       // Click on the link (it opens a new window
        System.out.println("Before click"+ mainWindowHandle);
       WebElement link = driver.findElement(By.linkText("Click Here"));
       link.click();
//        System.out.println("After click"+ mainWindowHandle);
        Set<String> windowHandles = driver.getWindowHandles();
        // All the window tab have a unique name
        for (String handle: windowHandles){
            driver.switchTo().window(handle);
            System.out.println(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Text is present");
            }
        }
        driver.switchTo().window(mainWindowHandle);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void closedBrowser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }

}
