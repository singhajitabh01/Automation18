package Basic;
//WAS by using enumerator class(Keys)
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester17 extends BasicSetting{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://funeralfunding.tactionsoft.com/funeralhome/addfuneralfunding");
		WebElement usr = driver.findElement(By.id("email"));
		usr.sendKeys("ankitfun@gmail.com");
		usr.sendKeys(Keys.CONTROL+"ac");
		WebElement pswrd = driver.findElement(By.name("password"));
		pswrd.sendKeys(Keys.CONTROL+"v");
		driver.close();
	}

}
