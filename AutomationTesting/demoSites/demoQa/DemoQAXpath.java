package demoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAXpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement fname = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]//form/div[1]/div[2]/input"));
		fname.sendKeys("Mayur");
		
		
		
		
		
		
		
		driver.quit();
	}
}
