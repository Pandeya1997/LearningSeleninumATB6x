package com.thetestingacademy.ex_23_07_2024_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;

public class Lab328 {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL) ;
        edgeOptions.addArguments("guest");
         driver = new EdgeDriver(edgeOptions);
    }

    @Test(groups = "QA")
    @Description("Test Case Description ")
    public void testPositive() throws InterruptedException {
        driver.get("https://awesomeqa.com/webtable1.html");
       driver.manage().window().maximize();

       ////table[@summary='Sample Table']/tbody   X path for table
        // //table[@summary= \"Sample Table\"]/tbody
        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rows_table  = table.findElements(By.tagName("tr"));
        System.out.println(table.getSize());
        for (int i = 0; i< rows_table.size();i++){
            List<WebElement> col = rows_table.get(i).findElements(By.tagName("td"));
            for (WebElement c:col){
                System.out.println(c.getText());
            }
        }

    }






    @AfterTest
    public void closeBrowser(){
       driver.quit();
    }
}
