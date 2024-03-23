import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/gmail/about/");
		//driver.findElement(By.name("Sign in")).click();
		driver.findElement(By.cssSelector("a.button.button--medium.button--mobile-before-hero-only")).click();
			//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			//actions action = new actions();
			//action.contextClick(By.name("Log in")).perform();
	}

}
