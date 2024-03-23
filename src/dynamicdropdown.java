
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	
public class dynamicdropdown {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","/Users/ANNIE/Documents/chromedriver/chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
	driver.findElement(By.xpath("//div[@value='AGR']")).click();
	//driver.findElement(By.xpath("//a[@text='Mangaluru (IXE)']")).click();
}
}
