package Actions;

import java.util.concurrent.TimeUnit;
//WAS to perform any keyboard action by using ACTIONS class
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.actitime.com/");
		WebElement element=driver.findElement(By.linkText("Pricing"));
		
		Actions actions=new Actions(driver);
		
		
		actions.keyDown(Keys.CONTROL);
		actions.click(element);
		actions.keyUp(Keys.CONTROL);
		actions.perform();
	}
}
