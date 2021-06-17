package Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basic.BasicSetting;

public class ahtsStudentForm extends BasicSetting{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ahtsdev.tactionsoft.com/signup/tutorsignup");
		driver.findElement(By.id("name_first")).sendKeys("");//First Name
		driver.findElement(By.id("name_last")).sendKeys("");//Last name
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		
	}

}
