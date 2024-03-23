import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class switchwindow {
	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.cssSelector("a.blinkingText")).click();
	 Set<String> window =driver.getWindowHandles(); //the windows would be stored in set datastructure
	 Iterator<String> it = window.iterator(); //to retrieve the windows stored in set datastructure
	 String parentwindow = it.next();
	 String childwindow = it.next();
	 driver.switchTo().window(childwindow);
	 String name = driver.findElement(By.xpath("//a[@class='blinkingText']")).getText().split("at")[1].trim().split(" ")[0];
	 driver.switchTo().window(parentwindow);
	 driver.findElement(By.id("username")).sendKeys(name);
			 }

}
