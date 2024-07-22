package com.thetestingacademy.VIC9;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NavigationVIC_INPLAY {
    @Test
    public void testNavigation(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("guest");
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://victoryexch9.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Victoryexch9");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://victoryexch9.com/");
        WebElement Button_login = driver.findElement(By.xpath("//button [@data-target = '#loginModal']"));
        Button_login.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement input_Username = driver.findElement(By.xpath("//input [@placeholder = 'Username']"));
        input_Username.sendKeys("BRBR11");

        // Enter  User name  and password with sumbit button clicks

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
//        WebElement button_cancel = driver.findElement(By.xpath("//button[text()='Cancel']"));
//        button_cancel.click();

// button[text()='Allow']
        WebElement button_Allow = driver.findElement(By.xpath("//  button[text()='Allow']"));
        button_Allow.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        WebElement button_matka = driver.findElement(By.xpath("//a[@href = '/games/matka-market']"));
//        button_matka.click();

        //a[@href='/']
        List<WebElement> Inplay_button = driver.findElements(By.xpath("//a[@href='/']"));
        Inplay_button.get(1).click();

       // England v West Indies
     //   WebElement  button_England = driver.findElement(By.xpath("//span [text()='England v West Indies']"));
        // dyanimic poition 5
        WebElement  button_place_5 = driver.findElement(By.xpath("(//div [@class= 'runner-name-date-container' ])[5]"));
        button_place_5.click();
              try {
                  Thread.sleep(3000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
        //odd
//        WebElement Back_odd_Button = driver.findElement(By.xpath("(//span[@class='price_odd_title'])[7]"));
//               Back_odd_Button.click();
        //odd
        List<WebElement> Back_odd_Button = driver.findElements(By.xpath("//span[@class='price_odd_title']"));
               Back_odd_Button.get(2).click();
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

               // Select stack
       //  //button [@class= 'stack_button select_amount_button' ])[1]   --> Xpth
        List<WebElement> place_bet = driver.findElements(By.xpath("//button [@class = 'stack_button select_amount_button']"));
        place_bet.get(0).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        // clicks place button
        // (//button [text()= 'Place Bet' ]) --> Xpath
       WebElement place_button = driver.findElement(By.xpath("(//button [text()= 'Place Bet' ])[1]"));
       place_button.click();
                 try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
     // Account
// //a[@id = 'accountDropdown'] --> xpath
        WebElement Account = driver.findElement(By.xpath("//a[@id = 'accountDropdown']"));
        Account.click();

        // open bets click
        //a[@href = '/open-bets']
        WebElement open_bets = driver.findElement(By.xpath("//a[@href = '/open-bets']"));
        open_bets.click();
               try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
               // logout
        //a[@href='javascript:void(0)']
        WebElement logout = driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
               try {
                   Thread.sleep(3000);
               }catch (InterruptedException e){
                   throw new RuntimeException(e);
               }
      // Homme
       //img [@alt = 'logo']
        WebElement Homme = driver.findElement(By.xpath("//img [@alt = 'logo']"));
        Homme.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
