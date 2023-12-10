package windowPopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().deleteAllCookies();
		
		
		
		// 	close popup
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		
		//  serch iphone
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("iphone 14 "+Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Midnight, 128 GB)']")).click();
		
		Thread.sleep(3000);
		
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
		
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		
		
		//driver.quit();
		
	}
	
	
}
