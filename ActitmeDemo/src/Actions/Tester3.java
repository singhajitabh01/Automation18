package Actions;
//WAS to perform double click by actions class
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.location='https://demoapp.skillrary.com/product.php?product=selenium-training';");
		WebElement element = driver.findElement(By.xpath("//button[@id='add']"));
		
		Actions actions=new Actions(driver);
		actions.doubleClick(element);
		actions.perform();
	}

}
