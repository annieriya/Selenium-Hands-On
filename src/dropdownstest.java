import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownstest {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//Create a class for Select Tag  Select dropdown= new Select(staticDropdown);
	WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	//Provide objectname within the Select class value
	Select dropdown= new Select(staticDropdown);
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
}
}
