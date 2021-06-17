package ScreenShot;
//WAS to take screenshot of username in actitime
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		LocalDateTime ldt=LocalDateTime.now();
		String s1 = ldt.toString().replace(":","-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		WebElement userField = driver.findElement(By.name("username"));
		File src = userField.getScreenshotAs(OutputType.FILE);
		File dest=new File("./shorts"+s1+".png");
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
