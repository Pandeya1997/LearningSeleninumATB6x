package com.thetestingacademy.SeleniumProject_2_MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Make_Appointment_Mini_Project {
    @Test
    public void tesAppointmentNegative(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new EdgeDriver(edgeOptions);
    //    WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");

        // Clicks the Appointment button

        WebElement button = driver.findElement(By.id("btn-make-appointment"));
        button.click();

        // Verify the url changes asserts



        //
        // Enter the username and password

        WebElement textInputBox = driver.findElement(By.id("txt-username"));
        textInputBox.sendKeys("Abhishekpy55");

        WebElement passwordInputBox = driver.findElement(By.id("txt-password"));
        passwordInputBox.sendKeys("123456");
 // login button click
        WebElement submitbutton = driver.findElement(By.id("btn-login"));
        submitbutton.click();

        // Error message verify

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement error_msg_loginFaild = driver.findElement(By.className("text-danger"));
        System.out.println(error_msg_loginFaild.getText());


        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
       driver.quit();
    }
}
