package JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//WAS to click on disable button
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to click on button by javascriptexecutor
public class Tester5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		WebElement LoginButton = driver.findElement(By.id("loginButton"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",LoginButton);

	}
}
