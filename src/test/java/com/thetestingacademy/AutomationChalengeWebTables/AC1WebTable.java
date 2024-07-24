package com.thetestingacademy.AutomationChalengeWebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class AC1WebTable {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);


    }

    @Test
    @Description("Test Nevigated to the URL")
    public void testNaviagte () throws InterruptedException {
    String URL = "https://demo.applitools.com";
    driver.get(URL);
    driver.manage().window().maximize();
    System.out.println(driver.getTitle());
    Assert.assertEquals(driver.getTitle(),"ACME Demo App by Applitools");


    // xPath id username
    WebElement username = driver.findElement(By.id("username"));
    username.sendKeys("Admin");
     // passoerd    password
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys("admin");
   //log-in
    WebElement login = driver.findElement(By.id("log-in"));
    login.click();

        // Find all the <span> elements with the class "text-success"
//List<WebElement> successElements = driver.findElements(By.cssSelector("span.text-success"));

//    // //div[@class='element-wrapper']/div[@class='element-box-tp']/div[@class='table-responsive']/table[@class='table table-padded']/tbody/tr/td[5]/span
//        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='element-wrapper']/div[@class='element-box-tp']/div[@class='table-responsive']/table[@class='table table-padded']/tbody/tr/td[5]/span"));
//       elements.get(0).click();
//       int sum= 0 ;
//        for (WebElement element : elements) {
//            String value = element.getText();
//             System.out.println(value);
//try {
//    int amount = Integer.parseInt(value);
//    sum += amount;
//}catch (NumberFormatException e){
//    System.out.println("Invalid value: " + value);
//}
//
//     }
//        System.out.println("Calculate the total amount spent this month."+sum);
List<WebElement> elements = driver.findElements(By.xpath("//div[@class='element-wrapper']/div[@class='element-box-tp']/div[@class='table-responsive']/table[@class='table table-padded']/tbody/tr/td[5]/span"));

int positiveSum = 0;
int negativeSum = 0;
int sum = 0;
for (WebElement element : elements) {
    String value = element.getText();
    try {
        // Remove any non-digit characters (e.g., currency symbols) from the string
        String numericValue = value.replaceAll("[^\\d.-]", ""); // Allow negative sign
        if (!numericValue.isEmpty()) {
            int number = Integer.parseInt(numericValue);
            if (number >= 0) {
                positiveSum += number;
            } else {
                negativeSum += number;
            }
        }
    } catch (NumberFormatException e) {
        // Handle non-numeric values if needed
        System.out.println("Non-numeric value encountered: " + value);
    }
}

System.out.println("Sum of positive values: " + positiveSum);
System.out.println("Sum of negative values: " + negativeSum);
sum = positiveSum + negativeSum;
        System.out.println("Sum of values " + sum );





    }

    @AfterTest
    public void closeBrowser() {
       try {
           Thread.sleep(3000);
       }catch (InterruptedException e){
           throw new RuntimeException(e);
       }
       driver.quit();

    }

}
