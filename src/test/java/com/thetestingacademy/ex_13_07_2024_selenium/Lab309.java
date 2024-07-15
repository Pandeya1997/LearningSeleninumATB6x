package com.thetestingacademy.ex_13_07_2024_selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class Lab309 {
    public static void main(String[] args) {
        EdgeOptions  edgeOptions = new EdgeOptions();
       edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    //    edgeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
       //    edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);



        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");
        driver.quit();


    }
}
