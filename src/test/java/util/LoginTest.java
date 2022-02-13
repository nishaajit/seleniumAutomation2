package util;

import java.io.IOException;
import static util.configReader.getUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends configReader{
	public void myLoginTest() throws IOException, InterruptedException {
		
	
	WebDriverManager. chromedriver ().setup();
	WebDriver driver = new  ChromeDriver();
    
    driver.manage().window().maximize();
    driver.get(getUrl());
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@id='email_field']")).sendKeys( getUsername());
    driver.findElement(By.xpath("//input[@id='password_field']")).sendKeys( getPassword());
    driver.findElement(By.xpath(" //button[normalize-space()='Login to Account']")).click(); 
}

	
}
