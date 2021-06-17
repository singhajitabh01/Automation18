package JavaScriptExecutor;
//Scrolling by using javascriptexecutor vertically
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Dimension dim=new Dimension(200,230);
		driver.manage().window().setSize(dim);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(500,0)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(-500,0)");
	}

}
