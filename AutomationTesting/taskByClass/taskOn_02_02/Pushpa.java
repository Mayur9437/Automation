package taskOn_02_02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pushpa {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//search&typePushpa
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Pushpa"+Keys.ENTER);
		
		Thread.sleep(2000);
		//click on wikipedia
		driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise - Wikipedia']")).click();
		
		//scroll
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");	
		
		//releaseDate
		String ab = driver.findElement(By.xpath("(//div[@class=\"plainlist\"])[4]")).getText();
		System.out.println(ab);
		
		//Country
		String ac = driver.findElement(By.xpath("(//td[@class=\"infobox-data\"])[12]")).getText();
		System.out.println(ac);
		
		
		//navigateBack
		Thread.sleep(2000);
		driver.navigate().back();
		
		//--------------------------------------------------IMBD------------------------------------------
		
		//scroll
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000)");		

		//IMDBLink
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise - Part 1 (2021) - IMDb']")).click();
		
		//scroll
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,6000)");		
		
		//releaseDate
		Thread.sleep(2000);
		String ad = driver.findElement(By.xpath("//a[text()='December 17, 2021 (United States)']")).getText();
		System.out.println(ad);
		
		//country
		String ae = driver.findElement(By.xpath("//a[text()='India']")).getText();
		System.out.println(ae);
		
		
		
		
		
		
		
		
	//	Thread.sleep(3000);
	//	driver.close();
	}
}
