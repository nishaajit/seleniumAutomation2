package com.salesforce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firfoxlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nisha\\Downloads\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		  WebElement username = driver.findElement(By.id("username"));
	        username.clear();
	        username.sendKeys("nisha@tekarch.com");
	        WebElement password1 = driver .findElement(By.id("password"));
	        password1.clear();
	        password1.sendKeys("athipillil26");
	        Thread.sleep(5000);
	        WebElement login = driver.findElement(By.id("Login"));
	        login.click();

	}

}
