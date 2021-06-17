package Basic;
//This is correct script as here we validate each field as it is present or not
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester9 extends BasicSetting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/");
		WebElement usrFild = driver.findElement(By.id("username"));
		WebElement passFild = driver.findElement(By.name("pwd"));
		WebElement button = driver.findElement(By.id("loginButton"));
		
		if (usrFild.isDisplayed()) {
			System.out.println("User name text display");
		} else {
			System.out.println("Password field not display");

		}
		if(passFild.isDisplayed()) {
			System.out.println("Pass field display");
		}else {
			System.out.println("Not Display");
		}
		if(button.isDisplayed()) {
			System.out.println("button is display");
		}else {
			System.out.println("Button is not display");
		}

	}

}
