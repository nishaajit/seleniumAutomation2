package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleTabsSelenium {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager. chromedriver ().setup();
		WebDriver driver = new  ChromeDriver();
        driver.get("https://qa-tekarch.firebaseapp.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_field")));
        WebElement email = driver.findElement(By.id("email_field"));
        email.clear();
        email.sendKeys("admin123@gmail.com");
        WebElement password = driver .findElement(By.id("password_field"));
        password.clear();
        password.sendKeys("admin123");
        
        WebElement login = driver.findElement(By.tagName("button"));
        login.click();
        
      WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
      WebDriverWait waits= new WebDriverWait (driver,30);
       waits.until(ExpectedConditions.visibilityOf(switchTo));
       Actions action = new Actions(driver);
       action.moveToElement(switchTo).build().perform();
      WebElement windowslink = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
      action.moveToElement(windowslink).build().perform();
      windowslink.click();
      WebElement tabbutton =driver.findElement(By.xpath("//button[contains(text(),'Tab')]"));
      waits.until(ExpectedConditions.visibilityOf(tabbutton));
      String currentTab = driver.getWindowHandle();
      action.moveToElement(tabbutton).build().perform();
      tabbutton.click();
    // WebElement googlesearch = driver.findElement(By.name("q"));
    // action.moveToElement(googlesearch).build().perform();
    // WebElement googlesearch = driver.findElement(By.xpath("//input[@title='Search']"));
      //googlesearch.sendKeys("java");
      Thread.sleep(5000);
      driver.switchTo().window(currentTab);
      WebElement logout = driver.findElement(By.xpath("//a[@onclick='logout']"));
     logout.click();
		
		
      
      
          
      
      
	}

	

	

}
