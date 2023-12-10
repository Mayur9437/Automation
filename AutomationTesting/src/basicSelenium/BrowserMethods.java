package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		driver.close();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
