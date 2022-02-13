package seleniumautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager. chromedriver ().setup();
		WebDriver driver = new  ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions action= new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		action.doubleClick(link).perform();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();
		Thread.sleep(5000);
		driver.close();

	}

}
