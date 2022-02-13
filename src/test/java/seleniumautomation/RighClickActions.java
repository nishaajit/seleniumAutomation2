package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RighClickActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager. chromedriver ().setup();
		WebDriver driver = new  ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions action= new Actions(driver);
		WebElement tab = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		action.contextClick(tab).perform(); // performing right click
		Thread.sleep(5000);
	driver.close();
		
		
	}

}
