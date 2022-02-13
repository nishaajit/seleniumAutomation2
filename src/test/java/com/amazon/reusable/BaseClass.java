package com.amazon.reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
protected static WebDriver driver;
	
	public static void launchApp (String url) throws InterruptedException {
	WebDriverManager. chromedriver ().setup();
	driver = new  ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize();
    Thread.sleep(5000);
	}
	public static void login (String userName, String password) throws InterruptedException {
		  WebElement username = driver.findElement(By.id("username"));
	       username.sendKeys(userName);
	       
	        WebElement password1 = driver .findElement(By.id("password"));
	        password1.sendKeys(password);
	        Thread.sleep(5000);
	        WebElement login = driver.findElement(By.id("Login"));
	        login.click();
	}        
}
