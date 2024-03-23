import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class greenkartaddmultipleitems {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/Users/ANNIE/Documents/chromedriver/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		String[] additems = {"Cucumber", "Banana", "Grapes"};
		for(int i=0;i<items.size(); i++)
		{
			String name= items.get(i).getText();
			List itemsNeeded = Arrays.asList(additems);
			if(itemsNeeded.contains(name))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}
	}
}

