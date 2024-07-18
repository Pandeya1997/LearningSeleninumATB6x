package com.thetestingacademy.ex_18_07_2024_Selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Lab316 {
    @Test
    public void testcaseCssSelector(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
       // Xpath - query languages to find the element in the html document
        // Relative - 99%
        // Absolute - Not body ignore
        // core logics x path   1. //tagName[@Attributes='values']
        // 2. XPath Function  1. text(), contains, start-with, end-with(), sub-string, Normalize-space
        // Xpath Axes --> Ancestors, following-sibling, parent, child, descendants, Preceding- sibling



    // css selector --> All  these
        // Logic -  tagName[attribute=value] ->  //tagName[@attribute=value]

// css selector are used to select elements in an HTML or XML documen
// in order to apply or other manipulation to those elements
        //Normal selector --> css selector
        // By.id --> #id
        // className  --> .class
        //  custom Attribute - <input type="text" data-qa="abc"/> -> [data-qa="abc"]
        // convert xpath -> css Selector also.

        // Css Selectors ->
        // contains Xpath contains() -> *
        // starts-with() - xpath -> ^
        // end-with() xpath -> $




        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
