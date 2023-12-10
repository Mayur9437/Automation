package demoSitesViaRealtiveXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WayToAutomation {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'name')][1]")).sendKeys(Keys.ENTER, "Mayur",Keys.TAB,"Salunke");
		
	}
}
