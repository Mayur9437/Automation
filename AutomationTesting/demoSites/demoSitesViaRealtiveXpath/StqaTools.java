package demoSitesViaRealtiveXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StqaTools {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='studentname']"));
		name.sendKeys("Mayur");
		
		Thread.sleep(1000);
		WebElement fname = driver.findElement(By.xpath("//input[@id='fathername']"));
		fname.sendKeys("Salunke");
		
		Thread.sleep(1000);
		WebElement pAdd = driver.findElement(By.xpath("//input[@id='paddress']"));
		pAdd.sendKeys("Chakan");
		
		Thread.sleep(1000);
		WebElement perAdd = driver.findElement(By.xpath("//input[@id='personaladdress']"));
		perAdd.sendKeys("Vishal Garden");
		
		Thread.sleep(1000);
		WebElement gender = driver.findElement(By.xpath("//input[@value='male']"));
		gender.click();
		
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.xpath("(//option[@value='Mumbai'])[1]"));
		city.click();
		
		Thread.sleep(1000);
		WebElement course = driver.findElement(By.xpath("(//option[@value='MCA'])[1]"));
		course.click();
		
		WebElement dis = driver.findElement(By.xpath("(//option[@value='Goa'])[1]"));
		dis.click();
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
