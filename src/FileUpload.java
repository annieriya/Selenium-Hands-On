import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class FileUpload {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.findElement(By.id("pickfiles")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\ANNIE\\Documents\\fileupload.exe");
	
	
	
}
}
