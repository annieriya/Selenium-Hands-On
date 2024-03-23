import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.Assert.*;


import dev.failsafe.internal.util.Assert;

public class dropdownwithsearchtext {
public static void main(String[] args) throws InterruptedException
		{
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	driver.findElement(By.id("Div1")).getAttribute("Style");
	if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
	{
System.out.println("is enabled");
	}
	else
	{
		System.out.println("is disabled");	
	}
	
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(3000L);
	//Using While loop
	int i=1;
	while (i<6)
	{
		 driver.findElement(By.id("hrefIncAdt")).click();
		 i++;
		}
	//for(int i=1; i <5 ; i++)
	//{
	// driver.findElement(By.id("hrefIncAdt")).click();
	//}
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Chen");
	driver.findElement(By.xpath("//input[@name ='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("Hyder");
	driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTXT'] input")).click();
	
	
		}
}
