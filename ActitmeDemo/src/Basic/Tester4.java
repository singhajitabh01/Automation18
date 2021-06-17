package Basic;
//WAS to differentiate between get() and navigate()
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 extends BasicSetting{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https:google.com");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.quit();
	}

}
