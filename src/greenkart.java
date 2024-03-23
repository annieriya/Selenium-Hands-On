import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class greenkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i< items.size(); i++)
		{
		String name= items.get(i).getText();
		if(name.contains("Cucumber"))
		{
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		}
		}
		for(int i=0; i< items.size(); i++)
		{
		String name= items.get(i).getText();
		if(name.contains("Banana"))
		{
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		}
		}
}
}
