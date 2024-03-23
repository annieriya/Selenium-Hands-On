import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class selectdateforflight {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","/Users/ANNIE/Documents/chromedriver/chromedriver.exe"  );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.cssSelector("div[class ='css-76zvg2.css-bfa6kz.r-homxoj.r-ubezar'][1]"));
	List<WebElement> dates = driver.findElements(By.className("css-1dbjc4n.r-1awozwy.r-14lw9ot.r-1loqt21.r-eu3ka.r-1otgn73.r-1aockid"));
	for(int i=1; 1< dates.size();i++)
	{
		String selectdate = dates.get(i).getText();
		if(selectdate.equalsIgnoreCase("31"));
		{
			dates.get(i).click();
			System.out.println(dates.get(i).getText());
		}
	}
}
	
}
