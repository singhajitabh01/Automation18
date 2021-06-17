package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAS to perform right click of mouse button/context menu
public class Tester4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.location='https://www.facebook.com/';");
		WebElement element=driver.findElement(By.name("login"));
		
		Actions actions=new Actions(driver);
		actions.contextClick(element);
		actions.perform();
		
		
	}
}
