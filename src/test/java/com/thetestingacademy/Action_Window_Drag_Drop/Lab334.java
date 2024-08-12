package com.thetestingacademy.Action_Window_Drag_Drop;


import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import javax.swing.*;

public class Lab334 {

    @Test
    public void testPostive() throws InterruptedException {
        EdgeDriver driver = new EdgeDriver() ;
    String URL = "https://www.makemytrip.com/";
     driver.get(URL);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
          System.out.println("Scroll Down")  ;
          Thread.sleep(3000);
          driver.quit();
    }
}
