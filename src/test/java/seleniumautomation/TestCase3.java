package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager. chromedriver ().setup();
		WebDriver driver = new  ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("nisha@tekarch.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("athipillil26");
		Thread.sleep(5000);
		WebElement checkbox= driver.findElement(By.xpath("//label[@for='rememberUn']"));
		checkbox.click();
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		String title= driver.getTitle();
		System.out.println("title of the current page"+ title);
		Actions a= new Actions(driver);
		WebElement usermenu = driver.findElement(By.xpath("//div[@title='User menu for Nisha Abcd']//span[@class='menuButtonLabel']"));
		usermenu.click();
		a.moveToElement(usermenu).build().perform();
		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		
			
		
		
		Thread.sleep(5000);
	
		
		
		

	}

}
