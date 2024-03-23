import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sample {
	
		public static void main(String[] args) throws InterruptedException
				{
			System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
			driver.findElement(By.id("select-demo")).sendKeys("Mon");
			List<WebElement> options = driver.findElements(By.cssSelector("select[@id ='select-demo'] option"));
			for (WebElement option : options)
			{
			if (option.getText().equalsIgnoreCase("Sunday"))
					{
			option.click();
			break;
			}
			}
				}
}
