package com.firebase.reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ReusableMethods {
	protected static WebDriver driver;
	
	public static void launchApp (String url) throws InterruptedException {
	WebDriverManager. chromedriver ().setup();
	driver = new  ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize();
    Thread.sleep(5000);
	}
	public static void login (String userName, String password) throws InterruptedException {
		  WebElement email = driver.findElement(By.id("email_field"));
	        email.clear();
	        email.sendKeys(userName);
	        WebElement password1 = driver .findElement(By.id("password_field"));
	        password1.clear();
	        password1.sendKeys(password);
	        Thread.sleep(5000);
	        WebElement login = driver.findElement(By.tagName("button"));
	        login.click();
	}
	public static void closeDriver () {
		driver.close();
		
	}
	
	
}
