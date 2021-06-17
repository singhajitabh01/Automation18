package Basic1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basic.BasicSetting;

public class Basic1 extends BasicSetting{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows) {
			driver.switchTo().window(window);
		//	String actualTitle = driver.getTitle();
		}
	}

}
