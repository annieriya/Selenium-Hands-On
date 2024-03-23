import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.Assert.*;


import dev.failsafe.internal.util.Assert;

public class easemytrip 
{
public static void main(String[] args) throws InterruptedException
		{
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
	driver.findElement(By.id("Div1")).getAttribute("Style");
	if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
	{
System.out.println("is enabled");
	}
	else 
	{
		System.out.println("is disabled");	
	}
		}
}
	