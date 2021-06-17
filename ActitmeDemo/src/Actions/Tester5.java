package Actions;
//WAS to drag and drop with help of actions class
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.id("box1"));
		WebElement target = driver.findElement(By.id("box101"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, target);
		actions.perform();
		
	}

}
