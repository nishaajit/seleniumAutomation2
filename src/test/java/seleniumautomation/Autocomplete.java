package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {

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
        WebElement Widget = driver.findElement(By.xpath("//button[normalize-space()='Widget']"));
        WebDriverWait waits= new WebDriverWait (driver,30);
         waits.until(ExpectedConditions.visibilityOf(Widget));
         Actions action = new Actions(driver);
         action.moveToElement(Widget).build().perform();
         
         WebElement Autocomplete = driver.findElement(By.xpath("//a[normalize-space()='AutoComplete']"));
         action.moveToElement(Autocomplete).build().perform();
         Autocomplete.click();
         Thread.sleep(5000);
       //  WebElement tab  = 
         driver.findElement(By.id("myInput")).sendKeys("un");
         List <WebElement > listOfCountry =driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']//div"));
         for( WebElement country : listOfCountry){
        	 if (country.getText().equalsIgnoreCase("United States Of America")) {
        		 System.out.println("selected="+ country.getText());
        		 country.click() ;
        		 break;
        	 }
         }
        		 
         
         
         
         

	}

}
