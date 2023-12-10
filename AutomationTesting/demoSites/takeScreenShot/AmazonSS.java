package takeScreenShot;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSS {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//ScreenShot
		UtilClass.takeScreenShot(driver, "Amazon1");
		
		//SearchIphone
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("inphone"+Keys.ENTER);
		
		//ScreenShot
		UtilClass.takeScreenShot(driver, "Amazon2");
		
		System.out.println("ScreenShot Saved");
		
		Thread.sleep(3000);
		//Scrolling
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		
		driver.findElement(By.xpath("//span[text()=\"Apple iPhone 13 Mini (256GB) - Pink\"]")).click();
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
	}
	
}
