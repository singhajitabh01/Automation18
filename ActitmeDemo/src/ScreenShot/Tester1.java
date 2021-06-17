package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to take screenshot of webpage
import com.google.common.io.Files;

public class Tester1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
	     File src = ts.getScreenshotAs(OutputType.FILE);
	     File dest=new File("./errorShort.png");
	     Files.copy(src, dest);
	     driver.close();
	}

}
