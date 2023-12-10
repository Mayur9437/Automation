package dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DdownExFindElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}
}
