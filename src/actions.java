
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class actions {
public static void main (String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	Actions act = new Actions(driver);
	WebElement move= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	act.moveToElement(move).contextClick().build().perform()
	act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();

	}
	}

	


