package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		//WebDriverManager. chromedriver ().setup();
		//WebDriver driver = new  ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nisha\\Downloads\\geckodriver.exe");

		WebDriver driver;
		driver = new FirefoxDriver();
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
        WebElement Fileupload = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a[3]"));
        WebDriverWait waits= new WebDriverWait (driver,30);
         waits.until(ExpectedConditions.visibilityOf(Fileupload));
         Actions action = new Actions(driver);
         action.moveToElement(Fileupload).build().perform();
         Fileupload.click();
         Thread.sleep(5000);
         WebElement browse= driver.findElement(By.id("logo"));
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("arguments[0].click();", browse);
         
         Runtime.getRuntime().exec("C://autoitfiles/fileupload.exe" + "C:\\Users\\Nisha\\OneDrive\\Pictures\\index.jpg");
        
         
         
         
	}

}
