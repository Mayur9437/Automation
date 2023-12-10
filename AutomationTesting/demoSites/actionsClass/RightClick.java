package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//click 0n right click 
		WebElement abc = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(abc).build().perform();
		
		//click on delete
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		//alert pop up
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
