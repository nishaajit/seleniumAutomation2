package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager. chromedriver ().setup();
		WebDriver driver = new  ChromeDriver();
        driver.get("https://qa-tekarch.firebaseapp.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement email = driver.findElement(By.id("email_field"));
        email.clear();
        email.sendKeys("admin123@gmail.com");
        WebElement password = driver .findElement(By.id("password_field"));
        password.clear();
        password.sendKeys("admin123");
        Thread.sleep(5000);
        WebElement login = driver.findElement(By.tagName("button"));
        login.click();
        WebElement Intractions = driver.findElement(By.xpath("//button[normalize-space()='Intractions']"));
        WebDriverWait waits= new WebDriverWait (driver,30);
         waits.until(ExpectedConditions.visibilityOf(Intractions));
         Actions action = new Actions(driver);
         action.moveToElement(Intractions).build().perform();
         
         WebElement tooltip = driver.findElement(By.xpath("//a[normalize-space()='Tool Tip']"));
         action.moveToElement(tooltip).build().perform();
         tooltip.click();
         Thread.sleep(5000);
         WebElement right = driver.findElement(By.xpath("//body/div[@id='user_div']/div[2]/div[1]"));
         action.moveToElement(right).perform();
         Thread.sleep(5000);
         WebElement left = driver.findElement(By.xpath("//body/div[@id='user_div']/div[2]/div[2]"));
         action.moveToElement(left).perform();
         Thread.sleep(5000);
         WebElement top = driver.findElement(By.xpath("//body/div[@id='user_div']/div[2]/div[3]"));
         action.moveToElement(top).perform();
         Thread.sleep(5000);
         WebElement bottom  = driver.findElement(By.xpath("//div[4]"));
         action.moveToElement(bottom).perform();
         Thread.sleep(5000);
         driver.close();
	}

}
