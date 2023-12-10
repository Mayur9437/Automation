package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		Thread.sleep(2000);
		WebElement devolps = driver.findElement(By.xpath("//span[@class=\"nav_item_name\"]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(devolps).build().perform();
		
		//Release date
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Release Notes']")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
