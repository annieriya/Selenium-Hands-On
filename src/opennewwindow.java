import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class opennewwindow {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.switchTo().newWindow(WindowType.WINDOW);   /// to open a new empty window
	Set<String> abc = driver.getWindowHandles();
	Iterator<String> it = abc.iterator();
	String parentWindow =it.next();
	String childWindow = it.next();
	driver.switchTo().window(childWindow);
	driver.get("https://courses.rahulshettyacademy.com/courses/");
	String courseName = driver.findElements(By.cssSelector("div[class='course-listing-title']")).get(2).getText();
	driver.switchTo().window(parentWindow);
	WebElement name = driver.findElement(By.cssSelector("[name='name']"));
	name.sendKeys(courseName);
	File scr = name.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr, new File ("C:\\Users\\ANNIE\\name.png"));
 }
}
