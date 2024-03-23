import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
public class webuiauto {
		public static void main (String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.findElement(By.id("inputUsername")).sendKeys("ann26m@gmail.com");
				driver.findElement(By.name("inputPassword")).sendKeys("Godsgrace1!");
				driver.findElement(By.className("signInBtn")).click();
				System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
				driver.findElement(By.linkText("Forgot your password?")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Annie");
				driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ann26m@gmail.com");
				driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("8939340134");
				driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();;
				System.out.println(driver.findElement(By.cssSelector("p.infoMsg"))
				
				//driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
				
				//actions action = new actions();
				//action.contextClick(By.name("Log in")).perform();
		}	
	}


