package popUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		//SimpleAlertPopup
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//ConfirmationPopUp
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		//PropmtPopUpPopUp
		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Mayur");
		driver.switchTo().alert().accept();
		
		
		
	
	}
}
