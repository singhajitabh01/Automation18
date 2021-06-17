package Basic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basic.BasicSetting;

public class Xpath extends BasicSetting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Mob')]")).click();
		
		
		
	}

}
