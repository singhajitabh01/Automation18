package Basic;
//WAS to verify the script using the url
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester10 extends BasicSetting{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/");
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		String expectedURL="https://demo.actitime.com/login.do";
		if(actualURL.equals(expectedURL)) {
			System.out.println("URL is correct");
		}else {
			System.out.println("URL is not correct");
		}
		
	}
}
