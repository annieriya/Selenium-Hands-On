import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.WebElement;

public class sorttableusingstreams {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ANNIE/Documents/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/sort/");
		driver.findElement(By.xpath("//tr/th[3]")).click();
		List<WebElement> country = driver.findElements(By.xpath("//tr/td[3]"));
		List<String> originalList = country.stream().map(s->s.getText()).collect(Collectors.toList());
		originalList.forEach(s->System.out.println(s));
		 List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		 sortedList.forEach(s->System.out.println(s));
		// Assert.isTrue(originalList.equals(sortedList));
	}
}
