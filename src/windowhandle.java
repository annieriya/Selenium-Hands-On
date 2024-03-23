import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandle {
	public static void main (String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.cssSelector("a./geolocation")).click();
	
	}
	
}
