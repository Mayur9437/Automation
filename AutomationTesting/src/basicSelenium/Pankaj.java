package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pankaj {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("mayur@gmail.com");
		
		Thread.sleep(3000);
		driver.close();
		
		
	}
}
