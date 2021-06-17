package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to scroll the page to a particular element
public class Tester3 {   
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension dim=new Dimension(321,345);
		driver.manage().window().maximize();
		driver.manage().window().setSize(dim);
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
		
		int Y = driver.findElement(By.xpath("//h2[text()='Masks and faceshields']")).getLocation().getY();		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,'"+Y+"')");
		Thread.sleep(3000);
		driver.close();
	}

}
