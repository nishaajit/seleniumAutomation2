package seleniumautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CheckBoxTest {
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement checkbox= driver.findElement(By.xpath("//label[@for='tree-node-home']"));
		String value=checkbox.getAttribute("type");
		System.out.println("value of type="+value);
		System.out.println(checkbox.isSelected());
		checkbox.click();
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
