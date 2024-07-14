package com.thetestingacademy.ex_11_07_2024_selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Lab300 {
    public static void main(String[] args) {
        // SearchContext driver = new EdgeDriver(); // Dynamic Dispatch(RunTime Polymorphism)
        // Possible but two functions , which is not much used

      // driver.findElement()
      // driver.findElements()

      //  WebDriver driver = new EdgeDriver();
        // 12 which are good

      //  RemoteWebDriver driver1 = new EdgeDriver();

      //  EdgeDriver driver = new EdgeDriver();


        // secnarios

        // 1. do want to run on chrome or edge
        // ChromeDriver driver = new ChromeDriver();
        // EdgeDriver drive2 = new EdgeDriver();

        // 2 Do you want to run on chrome then change to edge
//        WebDriver  driver = new ChromeDriver();
//        driver = new EdgeDriver();



        // 3. do you want to run on multiple browsers?
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)

    }

}
