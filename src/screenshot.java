import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenshot {
public static void main (String [] args) throws IOException
{
	System.setProperty("webdriver.chrome.driver","/Users/ANNIE/Documents/chromedriver/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com");
	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr, new File("C:\\Users\\ANNIE\\screenshot.png"));
}
}
