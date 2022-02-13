package seleniumautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException {
		WebDriverManager. chromedriver ().setup();
		WebDriver driver = new  ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\homepage.png");
		FileUtils.copyFile(scr, trg);
	}

}
