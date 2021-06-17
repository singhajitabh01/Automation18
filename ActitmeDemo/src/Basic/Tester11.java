package Basic;
//Verify home page is display or not
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester11 extends BasicSetting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.id("logoutLink"));
	    if(logout.isDisplayed()) {
	    	System.out.println("HomePage is Display");
	    }	else {
	    		System.out.println("Page not Display");
	    	}
			
		}
	}


