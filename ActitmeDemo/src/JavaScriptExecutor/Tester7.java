package JavaScriptExecutor;
//launch or navigate browser with javascriptexecutor
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.facebook.com/';");
		driver.quit();
	}

}
