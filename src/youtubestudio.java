import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ElementNotInteractableException;

public class youtubestudio {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
WebDriver driver =  new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://studio.youtube.com/");
driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("anniemaria526@gmail.com");
driver.findElement(By.id("identifierNext")).click();

//driver.findElement(By.cssSelector("input[@class='username']")).sendKeys("anniemaria0526@gmail.com");
}
}