package com.firesbase.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.firebase.reusable.ReusableMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

//public class AutomationScript extends Reusablemethods {
	//package com.firebase.test;

	import java.awt.AWTException;
	import java.awt.event.KeyEvent;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;

	import java.io.IOException;
	import java.awt.Robot;
	import java.util.List;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import com.firebase.reusable.ReusableMethods;
	public class AutomationScript extends ReusableMethods{
	
		public static void login(String userName,String password) {
			WebElement email= driver.findElement(By.id("email_field"));
			waitUntilVisible(email);
			enterText(email, userName);
			WebElement passwordElement=driver.findElement(By.id("password_field"));
			enterText(passwordElement, password);
			WebElement login=driver.findElement(By.tagName("button"));
			clickElement(login);
			
		}

		private static void clickElement(WebElement login) {
			// TODO Auto-generated method stub
			
		}

		private static void enterText(WebElement email, String userName) {
			// TODO Auto-generated method stub
			
		}

		public static void enterFormdataTest() throws InterruptedException {
		
			launchApp("https://qa-tekarch.firebaseapp.com/");
			login("admin123@gmail.com","admin123");
			WebElement femaleRadioButton = driver.findElement(By.cssSelector("#radiobut[value='female']"));
			waitUntilVisible(femaleRadioButton);
			femaleRadioButton.click();
			WebElement city=driver.findElement(By.id("city"));
			selectByValueData(city,"NEW DELHI");
			
			WebElement course= driver.findElement(By.xpath("//select[@id='course']"));
			selectByValueData(course,"mba");
			
			WebElement district= driver.findElement(By.id("district"));
			selectByValueData(district,4);
			closeDriver();
			
		}
		
		private static void selectByValueData(WebElement city, String string) {
			// TODO Auto-generated method stub
			
		}

		private static void selectByValueData(WebElement course, int i) {
			// TODO Auto-generated method stub
			
		}
@Test 
		public static void HandleWindowAlert() throws InterruptedException {
			launchApp("https://qa-tekarch.firebaseapp.com/");
			login("admin123@gmail.com","admin123");
			
			WebElement switchTo=driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
			waitUntilVisible(switchTo);
			mouseOver(switchTo);
			WebElement alertLink=driver.findElement(By.linkText("Alert"));
			clickElement(alertLink);
			WebElement windowAlertButton=driver.findElement(By.xpath("//div[contains(@class,'login')]//button[@type='button'][normalize-space()='Window Alert']"));
			waitUntilVisible(windowAlertButton);
			clickElement(windowAlertButton);
			AcceptAlert();
			Thread.sleep(3000);
			driver.close();
			
			
		}
		
		

		private static void AcceptAlert() {
			// TODO Auto-generated method stub
			
		}

		public static void HandleMultipleWindows() throws InterruptedException {
			launchApp("https://qa-tekarch.firebaseapp.com/");
			login("admin123@gmail.com","admin123");
			
			WebElement switchTo=driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
			waitUntilVisible(switchTo);
			mouseOver(switchTo);
			WebElement windowsLink=driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
			clickElement(windowsLink);
			WebElement windowButton=driver.findElement(By.xpath("//button[contains(text(),'Window')]"));
			waitUntilVisible(windowButton);
			String currentwindow=driver.getWindowHandle();
			clickElement(windowButton);
			Set<String> windows= driver.getWindowHandles();
			System.out.println("num of windows currently opned="+windows.size());
			for(String windowHandle:windows) {
				if(!windowHandle.equals(currentwindow)) {
					driver.switchTo().window(windowHandle);
					break;
				}
			}
			WebElement googleSearch=driver.findElement(By.name("q"));
			enterText(googleSearch,"selenium");
			Thread.sleep(5000);
			driver.switchTo().window(currentwindow);
			
			closeDriver();
			
			
		}
		
		
		public static void HandleTable() throws InterruptedException {
			launchApp("https://qa-tekarch.firebaseapp.com/");
			login("admin123@gmail.com","admin123");
			

			WebElement widget=driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
			mouseOver(widget);
			WebElement tableLink= driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
			clickElement(tableLink);
			WebElement table=driver.findElement(By.tagName("table"));
			waitUntilVisible(table);
			
			List<WebElement> listOfRows= table.findElements(By.xpath("//tr"));
			for(WebElement row:listOfRows) {
				List<WebElement> listOfdata= row.findElements(By.xpath("td"));
				for(WebElement data:listOfdata) {
					System.out.print(data.getText()+"   ");
				}
				System.out.println();
			}
			closeDriver();
		}
		
		public static void autocomplete() throws InterruptedException {
			launchApp("https://qa-tekarch.firebaseapp.com/");
			login("admin123@gmail.com","admin123");
			
			WebElement Widget = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
			mouseOver(Widget);
			driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")).click();
			driver.findElement(By.id("myInput")).sendKeys("un");
			List<WebElement> listOfCountry = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']//div"));
			for (WebElement country : listOfCountry) {
				if (country.getText().equalsIgnoreCase("United States of America")) {
					System.out.println("selected=" + country.getText());
					country.click();
					break;
				}
			}
			closeDriver();
			
		}
		private static void mouseOver(WebElement widget) {
			// TODO Auto-generated method stub
			
		}

		public static void RobotCheck() throws AWTException, InterruptedException {
			launchApp("https://qa-tekarch.firebaseapp.com/");
			login("admin123@gmail.com","admin123");
			Thread.sleep(3000);
			Robot robot=new Robot();
			robot.mouseWheel(2);
			//Thread.sleep(10000);
			//closeDriver();
			
		}
		
		
		public static void setClipboardData(String string) {
			//StringSelection is a class that can be used for copy and paste operations.
			   StringSelection stringSelection = new StringSelection(string);
			   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			}
		public static void uploadUsingRobot() throws IOException, InterruptedException {
			launchApp("https://qa-tekarch.firebaseapp.com/");
			login("admin123@gmail.com","admin123");
			
			WebElement FileUpload = driver.findElement(By.linkText("File Upload"));
			waitUntilVisible(FileUpload);
			FileUpload.click();
			WebElement clearField= driver.findElement(By.xpath("//button[contains(text(),\"Clear\")]"));
			waitUntilVisible(clearField);
			clearField.click();
			WebElement chooseFile= driver.findElement(By.xpath("//input[@name='logo']"));//click browse button
			
			 JavascriptExecutor executor = (JavascriptExecutor)driver;
			    executor.executeScript("arguments[0].click();",chooseFile);
			
			try {
	        	//Setting clipboard with file location
	            setClipboardData("D:\\BatchProjectCodes\\Dec21\\SeleniumAutomation\\src\\test\\resources\\index.jpg");
	            //native key strokes for CTRL, V and ENTER keys
	            Thread.sleep(2000);
	            Robot robot = new Robot();
		
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	        } catch (Exception exp) {
	        	exp.printStackTrace();
	        }
			

		}
	//autoIT sukuli

		private static void waitUntilVisible(WebElement fileUpload) {
			// TODO Auto-generated method stub
			
		}
		
	}
	


	


