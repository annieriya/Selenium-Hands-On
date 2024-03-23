
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	
public class spicejet {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","/Users/ANNIE/Documents/chromedriver/chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div.r-1862ga2.r-1loqt21.r-1i10wst.r-tceitz.r-u8s1d.css-76zvg2")).click();
	//driver.findElement(By.xpath("//a[@value ='COK']")).click();
//	driver.findElement(By.cssSelector("div.css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();
	//driver.findElement(By.xpath("//a[@text='Mangaluru (IXE)']")).click();
}
}
