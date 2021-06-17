package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester20 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./DRivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}

}
