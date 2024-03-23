import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class printlinks {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	//to print the number of links in the Webpage
	System.out.println(driver.findElements(By.tagName("a")).size());
	
	//to print the number of links in the Webpage footer section
	WebElement footerdriver = driver.findElement(By.id("navFooter"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	
	for (int i=1; i<footerdriver.findElements(By.tagName("a")).size(); i++ )
	{
	String openlinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
	footerdriver.findElements(By.tagName("a")).get(i).sendKeys(openlinks);
	}
	Set<String> abc = driver.getWindowHandles();
	Iterator<String> it = abc.iterator();
	
	while (it.hasNext())
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle().);
	}
	//to print the number of links in the 1st column of footer section
//WebElement columnfooterdriver 	= driver.findElement(By.className(".navFooterLinkColnavAccessibility[1]"));
//System.out.println(columnfooterdriver.findElements(By.tagName("a")).size());
}
}
