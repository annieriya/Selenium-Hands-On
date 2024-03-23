import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;




public class InvokingBrowsers {
public static void main (String[] args)
{
	//Chrome Browser
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//Firefox Browser
//System.setProperty("webdriver.gecko.driver", "/Users/ANNIE/Documents/geckodriver/geckodriver.exe");
//WebDriver driver = new FirefoxDriver();	

//Edge Browser
System.setProperty("webdriver.edge.driver", "/Users/ANNIE/Documents/msedgedriver/msedgedriver.exe");
WebDriver driver1 = new EdgeDriver();	


driver.get("https://youtube.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver1.get("https://www.instagram.com/");
System.out.println(driver1.getPageSource());
driver1.get("https://www.google.com/");
System.out.println(driver1.getTitle());
System.out.println(driver1.getCurrentUrl());
driver1.quit();
}
}

