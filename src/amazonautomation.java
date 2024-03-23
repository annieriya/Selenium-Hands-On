import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.time.Duration;


public class amazonautomation {
public static void main (String[] args)
{
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).click();
	WebElement signin = driver.findElement(By.cssSelector("a.nav-action-signin-button"));
	//if(driver.findElement(By.cssSelector("a.nav-action-signin-button")).getAttribute("data-nav-ref").contains("nav_signin"));
	//{
	//	signin.click(); continue-announce
	//}
	driver.findElement(By.id("nav-orders")).click();
	driver.findElement(By.id("ap_email")).sendKeys("riyaanu45@gmail.com");
	driver.findElement(By.cssSelector("input.a-button-input")).click();
	//driver.findElement(By.id("signInSubmit")).click(); 
	//driver.findElement(By.id("ap_password")).sendKeys("Silvermoon1!");
	//driver.findElement(By.id("signInSubmit")).click(); 
	//WebElement alert = driver.findElement(By.className("a-alert-heading"));
	//if(alert.getText().contains("problem"))
	//{
		//	System.out.println(alert.getText());
	//	}
			driver.findElement(By.id("ap_password")).sendKeys("Bluefire1!");
			driver.findElement(By.id("signInSubmit")).click(); 
			driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<WebElement> items= driver.findElements(By.cssSelector("div.a-column.a-span9.a-span-last"));
			for(int i=0; i<items.size(); i++)
			{
				String name = items.get(i).getText();
				if(name.contains("prime"))
				{
			items.get(i).click();
				}
			}
	}
	}

