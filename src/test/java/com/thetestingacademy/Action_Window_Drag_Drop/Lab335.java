package com.thetestingacademy.Action_Window_Drag_Drop;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Lab335 {

    EdgeDriver driver;
    private Actions actions;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test
    @Description("Dragon drop use moethod this program ")
    public void testPositive(){
        String URL = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(URL);
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions actions = new Actions(driver);
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));
//        actions.dragAndDrop(from,to).perform();
        actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.get("https://awesomeqa.com/selenium/upload.html");
       // fileToUpload
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        //or  do not intersted in this Absultue path then dir
        String dir = System.getProperty("user.dir");
       // System.out.println(dir); // C:\Users\AARRSOL\IdeaProjects\LearningSeleninumATB6x
        uploadFileInput.sendKeys(dir+"\\src\\test\\java\\com\\thetestingacademy\\Action_Window_Drag_Drop\\toUpload.txt");
        driver.findElement(By.name("submit")).click();
//        uploadFileInput.sendKeys("C:\\Users\\AARRSOL\\IdeaProjects\\LearningSeleninumATB6x\\src\\test\\java\\com\\thetestingacademy\\Action_Window_Drag_Drop\\toUpload.txt");
//        driver.findElement(By.name("submit")).click();



        // Download File
        // checked by the chromeOption
        // problem - download a file and check in the dir if that is present
        // chromeOptions --> dir (Doc )
        // Filename.doc --> /User/Pramod/Download/ chrome
        // file exit
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
