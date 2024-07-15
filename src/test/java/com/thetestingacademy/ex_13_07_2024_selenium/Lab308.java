package com.thetestingacademy.ex_13_07_2024_selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class Lab308 {
    public static void main (String arg []) throws InterruptedException  {
        EdgeOptions  options = new EdgeOptions();
        // Browser - Headless (NO UI) or full mode
        // 1. Headless - no ui , Performs good , fast execution
        // 2.  Full mode - UI , slower execution >100 Testcase
        // options - Browser - start maximize , add extension , add option


        // options.addArguments("start-maximized");
        //options.addArguments("window-size= 800,600");
       // options.addArguments("incognito");
       // options.addArguments("guest");

//        Proxy proxy = new Proxy();
//        Proxy.setHttpProxy("222.129.35.173:57114");
//        options.setCapability("proxy",proxy);


        WebDriver driver = new EdgeDriver(options);
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        Thread.sleep(5000); // worst way to add wait in the script to let the page load
        driver.quit();
    }
}
