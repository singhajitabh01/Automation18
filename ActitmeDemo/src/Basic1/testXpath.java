package Basic1;
//xpath by using independent and dependent xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basic.BasicSetting;

public class testXpath extends BasicSetting{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//label[text()='Male']/../..//input[@name='sex']")).click();
		WebElement gendr=driver.findElement(By.xpath("(//label[text()='Male']/../..//input[@name='sex'])[3]"));
		gendr.click();
	}

}
