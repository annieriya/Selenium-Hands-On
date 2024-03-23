import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//p-autocomplete[@id='origin']")).sendKeys("CHENNAI EGMORE - MS (CHENNAI)");
		List<WebElement> options = driver
				.findElements(By.cssSelector("ng-tns-c57-8 ng-star-inserted ui-autocomplete-list-item ui-corner-all"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("CHENNAI EGMORE - MS")) {
				option.click();
				break;
			}
		}

		// driver.findElement(By.cssSelector("a.search_btn.loginText.ng-star-inserted")).click();
		// driver.findElement(By.xpath("//input[@placeholder='User
		// Name']")).sendKeys("ann26m@gmail.com");
		// driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Godsgrace26!");
		// driver.findElement(By.className("search_btn train_Search")).click();
		// System.out.println(driver.findElement(By.cssSelector("img.captcha-img")));

	}
}
