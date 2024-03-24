import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class amazon {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/Users/ANNIE/Documents/chromedriver/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> phone = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));
		// driver.findElement(By.xpath("//span[@class='a-size-medium.a-color-base.a-text-normal'][2]"));

	for(int i=0 ; i <phone.size(); i++)
{
		String name=phone.get(i).getText();
		if(name.contains("Green"));
		{
			driver.findElement(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal")).click();
		}
}
	}
}


	
	
	
	

	

