import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class everystylishauto {
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://everstylish.com/");
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		action.moveToElement(driver.findElement(By.className("pe-7s-user"))).click();
		List<WebElement> items = driver.findElements(By.cssSelector("a[class ='social-login']"));
		for (int i=1 ; i < items.size() ; i++) {
			String name = items.get(i).getText();
			if (name.contains("Login"))
			{
				items.get(i).click();
			}
			}
		}
	}


