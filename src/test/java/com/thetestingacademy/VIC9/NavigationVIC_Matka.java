package com.thetestingacademy.VIC9;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class NavigationVIC_Matka {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--start-maximized");
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Test(groups = "QA Stage  ")
    @Description("Test Case #1  Navigation to Matka with Place a Bets ")
    public void testNavigation() throws InterruptedException {
        driver.get("https://victoryexch9.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Victoryexch9");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://victoryexch9.com/");
        WebElement Button_login = driver.findElement(By.xpath("//button [@data-target = '#loginModal']"));
        Button_login.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Enter  User name  and password with sumbit button clicks
        WebElement input_Username = driver.findElement(By.xpath("//input [@placeholder = 'Username']"));
        input_Username.sendKeys("BRBR11");

        WebElement input_password = driver.findElement(By.xpath("//input [@placeholder= 'Password']"));
        input_password.sendKeys("abcd12345");

        WebElement button_login = driver.findElement(By.xpath("//button [@title= 'Login']"));
        button_login.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://victoryexch9.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

      //         NOTIFICATION
        // Cancel
        WebElement button_cancel = driver.findElement(By.xpath("//button[text()='Cancel']"));
        button_cancel.click();

       // button[text()='Allow']
        WebElement button_Allow = driver.findElement(By.xpath("//  button[text()='Allow']"));
        button_Allow.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Navigated to Matka

        WebElement button_matka = driver.findElement(By.xpath("//a[@href = '/games/matka-market']"));
        button_matka.click();

        // 1st Event Clicks Like Ghaziabad

        //Ghaziabad Event CLicks
     // //div[@id='gaziabad'] Xpath
//        WebElement GhaziabadEvent = driver.findElement(By.xpath("//div[@id='gaziabad']"));
//        GhaziabadEvent.click();
// or
        // (//div [@class = 'game_name_container'])[12]

//    List<WebElement> GhaziabadEvent1 = driver.findElements(By.xpath("//div[@class='matka-overlay']"));
//        GhaziabadEvent1.get(1).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='madhur-daycont']")));

        WebElement Event1 = driver.findElement(By.xpath("//div[@id='madhur-daycont']"));
        Event1.click();
        System.out.println(Event1.findElement(By.xpath("//div[@id='madhur-daycont']" )).getText());
        Assert.assertEquals(Event1.findElement(By.xpath("//div[@id='madhur-daycont']")).getText(), "MADHUR DAY\n" +
                "OPEN 01:22 PM\n" +
                "CLOSE 03:33 PM\n" +
                "OPEN\n" +
                "CLOSE\n" +
                "JODI\n" +
                "TODAY\n" +
                "NYD\n" +
                "NYD\n" +
                "NYD\n" +
                "YESTERDAY\n" +
                "NYD\n" +
                "NYD\n" +
                "NYD");

         try {
             Thread.sleep(3000);
         }catch (InterruptedException e){
             throw new RuntimeException(e);
         }



//        //odd
////        WebElement Back_odd_Button = driver.findElement(By.xpath("(//span[@class='price_odd_title'])[7]"));
////               Back_odd_Button.click();
//        //odd
//        List<WebElement> Back_odd_Button = driver.findElements(By.xpath("//span[@class='price_odd_title']"));
//        Back_odd_Button.get(2).click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        // Select stack
//        //  //button [@class= 'stack_button select_amount_button' ])[1]   --> Xpth
//        List<WebElement> place_bet = driver.findElements(By.xpath("//button [@class = 'stack_button select_amount_button']"));
//        place_bet.get(0).click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        // clicks place button
//        // (//button [text()= 'Place Bet' ]) --> Xpath
//        WebElement place_button = driver.findElement(By.xpath("(//button [text()= 'Place Bet' ])[1]"));
//        place_button.click();
//
//
//
//
//        //  Navigated to Account
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        // Account
//// //a[@id = 'accountDropdown'] --> xpath
//        WebElement Account = driver.findElement(By.xpath("//a[@id = 'accountDropdown']"));
//        Account.click();
//
//        // open bets click
//        //a[@href = '/open-bets']
//        WebElement open_bets = driver.findElement(By.xpath("//a[@href = '/open-bets']"));
//        open_bets.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        // logout
//        //a[@href='javascript:void(0)']
//        WebElement logout = driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        // Homme
//        //img [@alt = 'logo']
//        WebElement Homme = driver.findElement(By.xpath("//img [@alt = 'logo']"));
//        Homme.click();
    }


    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
