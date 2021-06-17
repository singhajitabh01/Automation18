package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
//WAS to get generic Screenshot
public class Tester2 {
	public static void geterrorShot(WebDriver driver,String name) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+name+".png");
		try {
			Files.copy(src, dest);
		} 
		catch (IOException e) {
		
		}
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		geterrorShot(driver,"short1");
		
		driver.navigate().to("https://facebook.com/");
		geterrorShot(driver,"short2");

	}

}
