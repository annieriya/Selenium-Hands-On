import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra {
		public static void main (String[] args)
			{
			System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				driver.get("https://www.yatra.com/cheap-air-tickets/");
				WebElement header= driver.findElement(By.className("desktop-header"));
			List<WebElement> links = header.findElements(By.tagName("a"));	
for(int i=1; i< links.size(); i++)
{
	String open = Keys.chord(Keys.CONTROL, Keys.ENTER);
           links.get(i).sendKeys(open);
			}
Set<String> abc = driver.getWindowHandles();
Iterator<String> it = abc.iterator();
while(it.hasNext())
{
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
}
	driver.findElement(By.id("BE_flight_origin_date"));
	List<WebElement> date = driver.findElements(By.tagName("th"));	
	for(int i=1; 1<date.size(); i++)
	{
		String selectdate = date.get(i).getText();
		if(selectdate.equalsIgnoreCase("23"))
		{
			date.get(i).click();
			break;
		}
	}
			}
}
			

