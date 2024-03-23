import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatortest {
	@SuppressWarnings("deprecation")
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.instagram.com/");
			driver.findElement(By.name("username")).sendKeys("ann26m@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Godsgrace1!");
			driver.findElement(By.cssSelector("button._acan._acap._acas._aj1-._ap30")).click();
			//driver.findElement(By.cssSelector("div.xxz18i5.x10l6tqk.x17qophe.x13vifvy.x1lliihq.x14vqqas.x1kjsxda.x1useyqa")).click();
			
			//actions action = new actions();
			//action.contextClick(By.name("Log in")).perform();
	}
}
