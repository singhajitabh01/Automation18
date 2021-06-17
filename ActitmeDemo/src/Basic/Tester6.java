package Basic;
//WAS to use the getText()
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester6 extends BasicSetting{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement forgetPass = driver.findElement(By.id("toPasswordRecoveryPageLink"));
		String txtFld = forgetPass.getText();
		System.out.println(txtFld);
		forgetPass.click();
		Thread.sleep(2000);
		driver.close();
	}

}
