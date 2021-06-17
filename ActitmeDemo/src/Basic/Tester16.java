package Basic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to scroll to a particular element

public class Tester16 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://funeralfunding.tactionsoft.com/funeralhome/addfuneralfunding");
		driver.findElement(By.id("email")).sendKeys("ankitfun@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin1");
		driver.findElement(By.id("submitbutton")).submit();
		driver.findElement(By.partialLinkText("Approved Funeral Funding Req")).click();
		driver.findElement(By.linkText("Link Funeral Funding Request Form")).click();
		
		

	}
}