package com.thetestingacademy.ex_11_07_2024_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab304 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://bing.com");

        //  // no back , forward allowed in case of get

        driver.navigate().to ("https://app.vwo.com");
        driver.navigate().to("https://google.com");
        driver.get("https://www.facebook.com/login.php");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //To reiterate: navigate().to() and get()
        // do exactly the same thing. One's just a lot easier to type than the other!


    }
}
