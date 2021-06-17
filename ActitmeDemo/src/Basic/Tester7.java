package Basic;
//WAS to get the title of all child window htrough getWindow handles().
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester7 extends BasicSetting{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		driver.quit();
	
	}
}
