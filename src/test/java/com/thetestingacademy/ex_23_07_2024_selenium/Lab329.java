package com.thetestingacademy.ex_23_07_2024_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class Lab329 {
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
        String URL = "https://www.flipkart.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        // svg - Scalable vector graphics
        // svg, path , cicle, polygon
        // svg -> path -> g - shapes.

        //  //*[local-name()='svg']
        //  //*[name()='svg']  , contains(), text(), name()
        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();
    }
    @AfterTest
    public void closeBrowser(){
try {
    Thread.sleep(3000);
}catch (InterruptedException e){

    throw new RuntimeException(e);
}
        driver.quit();
    }

}


