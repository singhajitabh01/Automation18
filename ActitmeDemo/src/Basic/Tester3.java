package Basic;
//WAS to verify source code using contain method
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester3 extends BasicSetting{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https:google.com");
		String pgSorce = driver.getPageSource();
		if(pgSorce.contains("Copyright The Closure Library Authors")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test Case Fail");
		}
	
	}
}
