package com.ajx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
     WebDriver webDriver;
     @BeforeTest
     public void open(){
          System.setProperty("webdriver.chrome.driver","F:\\text\\testngg\\driver\\chromedriver.exe");
          webDriver = new ChromeDriver();
     }

     @Test
     public void getTest(){
          webDriver.get("http://139.159.242.156:85/#/login");
          webDriver.manage().window().maximize();
          webDriver.findElement(LoginPage.userName).sendKeys("admin");
          webDriver.findElement(LoginPage.userPwd).sendKeys("a1234567");
          webDriver.findElement(LoginPage.loginButton).click();
     }

     @AfterTest
     public  void close(){
          webDriver.quit();
     }

}
