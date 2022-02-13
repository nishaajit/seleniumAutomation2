package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {

	public static void main(String[] args)throws InterruptedException  {
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
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println("title of the current page="+ title);
        driver.findElement(By.id("name")).sendKeys("nisha");
        driver.findElement(By.id("lname")).sendKeys("ajith"); 
        driver.findElement(By.id("postaladdress")).sendKeys("xyz");
        driver.findElement(By.id("personaladdress")).sendKeys("GC");
            boolean radiobutton1= driver.findElement(By.cssSelector("#radiobut[value='male']")).isSelected();
            System.out.println("is radio button selected ?=" +radiobutton1);
      WebElement radiobutton2 =driver.findElement(By.cssSelector("#radiobut[value='female']"));
      radiobutton2.click();
      System.out.println(radiobutton2.isSelected());
        
        
        
        

        
        
        

	}

}
