package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		driver.switchTo().frame("moneyiframe");
		
		String abc = driver.findElement(By.xpath("//span[@id='bseindex']")).getText();
		System.out.println(abc);
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}
}
