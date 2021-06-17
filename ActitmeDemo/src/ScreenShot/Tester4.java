package ScreenShot;
import java.io.File;
import java.io.IOException;
//to take screenshot with different name and with different character
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tester4 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		LocalDateTime ldt=LocalDateTime.now();
		String replaceChar = ldt.toString().replace(":","-");
		WebElement LoginButn = driver.findElement(By.id("loginButton"));
		File src = LoginButn.getScreenshotAs(OutputType.FILE);
		File dest=new File("./eshorts.png"+replaceChar+".png");
		FileUtils.copyFile(src, dest);
		driver.close();
		
	}

}
