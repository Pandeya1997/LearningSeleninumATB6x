package com.thetestingacademy.Action_Window_Drag_Drop;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Lab340 {

    EdgeDriver driver;
    private Actions actions;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Test Case Description  Releative locator ")
    public void testPositive() {
       String  URL = "https://www.aqi.in/real-time-most-polluted-city-ranking";
        driver.get(URL);
      driver.manage().window().maximize();
//      WebElement searchElement = driver.findElement(By.id("search_city"));
//        searchElement.sendKeys("Mumbai");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement searchElement = driver.findElement(By.xpath("//input[@id='search_city']"));
        searchElement.sendKeys("India"+ Keys.ENTER);
        //table[@id="example"]/ tbody/tr [@role = 'row']
        //table[@id="example"]/ tbody/tr /td[2]

       List<WebElement> listofcity = driver.findElements(By.xpath("//table[@id='example']/ tbody/tr [@role = 'row']/td[2]"));
       for (WebElement l : listofcity){
          String s1 = driver.findElement(with(By.tagName("p")).toRightOf(l)).getText();
          String s2 = driver.findElement(with(By.tagName("p")).toLeftOf(l)).getText();
          String s3 = driver.findElement(with(By.tagName("p")).above(l)).getText();
          String s4 = driver.findElement(with(By.tagName("p")).below(l)).getText();
           System.out.println(l.getText()+ " --> " + s1 + " --> " + s2 );
           System.out.println(l.getText()+ " --> " +s3 + "-->"+ s4);
       }
    }


    @AfterTest
    public void closedBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }

}
