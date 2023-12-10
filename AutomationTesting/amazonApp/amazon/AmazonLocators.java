package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLocators {
	
	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();

		WebElement se =driver.findElement(By.name("field-keywords"));
		se.sendKeys("iphone 14 pro");
		
		WebElement ser = driver.findElement(By.id("nav-search-submit-button"));
		ser.click();
	}
}
