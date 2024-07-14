package com.thetestingacademy.ex_11_07_2024_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab303 {
    public static void main(String[] args) {
       WebDriver driver = new EdgeDriver();
       driver.get("https://app.vwo.com");
       // Diff between close and quit
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.close();
//        Thread.sleep(5000);
//        driver.close();
//        // driver.close();
//        // Close the Current Browser Window
//        // Not the full browser
//        // Session ID != NULL


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        // Close all the /sessions/windows and stop the browser
        // Session = null, Error - Session ID is null

    }
}
