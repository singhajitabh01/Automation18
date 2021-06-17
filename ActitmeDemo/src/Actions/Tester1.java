package Actions;
import org.openqa.selenium.By;
//WAS to perform mousehover with actions class 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to perform mousehover with help of moveToElement
public class Tester1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement element = driver.findElement(By.id("navbarDocumentation"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
	}

}
