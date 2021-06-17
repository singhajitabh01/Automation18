package Basic;
//WAS for linktext() and partial linkText
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester5 extends BasicSetting{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com/");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("FORGET")).click();
		
	}
	
}
