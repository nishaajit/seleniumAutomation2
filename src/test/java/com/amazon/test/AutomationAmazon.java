package com.amazon.test;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amazon.reusable.BaseClass;

public class AutomationAmazon extends BaseClass {
	
	public static void login (String userName, String password) throws InterruptedException{
		
		 WebElement username = driver.findElement(By.xpath("//input[@id='ap_email']"));
	       username.sendKeys(userName);
	       driver.findElement(By.id("continue")).click();
	      
	        WebElement password1 = driver .findElement(By.xpath(" //input[@id='ap_password']"));
	        password1.sendKeys(password);
	        Thread.sleep(5000);
	        WebElement signin = driver.findElement(By.id("signInSubmit"));
	        signin.click();
	        
	}

	public static void testcase1() throws InterruptedException {
		
		launchApp("https://www.amazon.com/");
		WebElement usermenu = driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[contains(@class,'nav-line-2')]"));
		usermenu.click();
		Thread.sleep(5000);
	    login("nishaajith26@gmail.com","madhavaji");
	    System.out.println("home page is displayed,test passed");
	}
	public static void testcase2 () throws InterruptedException {
		launchApp("https://www.amazon.com/");
		WebElement usermenu = driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[contains(@class,'nav-line-2')]"));
		usermenu.click();
		Thread.sleep(5000);
	    login("nishaajith26@gmail.com","madhavaji");
	    Actions a = new Actions(driver);
	   WebElement menu = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
	   a.moveToElement(menu).perform();
	   driver.findElement(By.xpath("//a[@id='nav-item-signout']//span[@class='nav-text']")).click()	;
	   System.out.println("clicked signout and signout was successfull but no popping window appeared");
	   }
	public static void testcase3 () throws InterruptedException {
		launchApp("https://www.amazon.com/");
		WebElement usermenu = driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[contains(@class,'nav-line-2')]"));
		usermenu.click();
		Thread.sleep(5000);
	    login("nishaajith26@gmail.com","madhavaji");
	    Thread.sleep(5000);
	    WebElement cart = driver.findElement(By.id("nav-cart-count"));
		   cart.click();
		   WebElement checkbox = driver.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy sc-item-check-checkbox-pc-desktop sc-list-item-checkbox']//i[@class='a-icon a-icon-checkbox']"));
	checkbox.click();
	System.out.println("addedd item got displayed and verified the item is selected");
	}
	public static void testcase4 () throws InterruptedException {
		launchApp("https://www.amazon.com/");
		WebElement usermenu = driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[contains(@class,'nav-line-2')]"));
		usermenu.click();
		Thread.sleep(5000);
	    login("nishaajith26@gmail.com","madhavaji");
	    Thread.sleep(5000);
	    WebElement cart = driver.findElement(By.id("nav-cart-count"));
		cart.click();
 WebElement delete =driver.findElement(By.xpath("//input[@aria-label='Delete 8 Inch Frying Pan with Lid, Small Frying Pan with Bakelite Handle, 8 Inch Frying Pan Nonstick with Stone-Derived Coating, Small Nonstick Frying Pan with Lid -8 Inch']"));		
	delete.click();
	System.out.println("delete botton clicked and shopping cart is empty");
	}
	public static void testcase5 () throws InterruptedException {
		launchApp("https://www.amazon.com/");
		WebElement usermenu = driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[contains(@class,'nav-line-2')]"));
		usermenu.click();
		Thread.sleep(5000);
	    login("nishaajith26@gmail.com","madhavaji");   
	    Thread.sleep(5000);
	    WebElement orders = driver.findElement(By.xpath(" //a[@id='nav-orders']//span[@class='nav-line-2']"));
		orders.click();
	}
}

