package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import takeScreenShot.UtilClass;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		// handle dropdown
		
		WebElement dropd = driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
		Select s = new Select(dropd);
		
		
		s.selectByIndex(3);
		
		Thread.sleep(2000);
		s.selectByValue("search-alias=amazon-pharmacy");
		
		Thread.sleep(2000);
		s.selectByVisibleText("Clothing & Accessories");
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
