package JavaScriptExecutor;
//Scrolling by using javascriptexecutor horizontally
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.hrome.driver","./Drivers/chromedrier.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		driver.close();
	}

}
