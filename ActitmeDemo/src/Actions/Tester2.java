package Actions;
//WAS to perform mousehover with help of moveByOffset
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		Actions actions =new Actions(driver);
		actions.moveByOffset(652, 98);
		actions.perform();
	}

}
