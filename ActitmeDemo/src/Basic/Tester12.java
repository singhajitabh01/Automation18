package Basic;

import java.util.concurrent.TimeUnit;
//WAS to use explicit wait
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester12 extends BasicSetting {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/");
		String logTitle = driver.getTitle();
		System.out.println(logTitle);
		// driver.findElement()
		WebDriverWait wait = new WebDriverWait(driver, 20);// create object
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		System.out.println(driver.getTitle());

	}

}
