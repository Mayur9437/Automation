package demoSitesViaRealtiveXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolQA {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys("Mayur");
		
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys("Salunke");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("mayur@gmail.com");
		
		WebElement gen = driver.findElement(By.xpath("(//label[@class=\"custom-control-label\"])[1]"));
		gen.click();
		
		WebElement mno = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mno.sendKeys("907019437");
		
//		WebElement date = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
//		date.sendKeys("19/01/1997");
		
//		WebElement sub = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
//		sub.sendKeys("Engilsh");
		
//		WebElement hobby = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
//		hobby.click();
		
		WebElement cAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		cAdd.sendKeys("At post Chakan ");
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
