package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to verify title
public class Tester2 extends BasicSetting{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https:google.com");
		String expectedTitle="Google";
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		if(ActualTitle.equals(expectedTitle)) {
			System.out.println("Title Match");
		}else {
			System.out.println("Not matching the title");
		}
	
	}
}
