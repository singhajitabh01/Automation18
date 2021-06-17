package JavaScriptExecutor;
//WAS to handle the disable element Type1
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to handle the disable element
public class Tester4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement displayField = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].scrollintoView();",displayField);
		jse.executeScript("arguments[0].value='qspider';",displayField);
	}

}
