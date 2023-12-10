package demoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WayToAutomation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement fname = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[1]/p[1]/input"));
		fname.sendKeys("Mayur");
		
		Thread.sleep(1000);
		WebElement lname = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[1]/p[2]/input"));
		lname.sendKeys("Salunke");
		
		Thread.sleep(1000);
		WebElement mstatus = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[2]/div/label/input[1]"));
		mstatus.click();
		
		Thread.sleep(1000);
		WebElement hobby = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[3]/div/label/input[1]"));
		hobby.click();
		
		Thread.sleep(1000);
		WebElement pno = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[6]/input"));
		pno.sendKeys("9075019437");
		
		Thread.sleep(1000);
		WebElement uname = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[7]/input"));
		uname.sendKeys("mayursalunke9437");
		
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[8]/input"));
		email.sendKeys("msalunke9437@gmail.com");
		
		Thread.sleep(1000);
		WebElement abtur = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[10]/textarea"));
		abtur.sendKeys("Hey....! Myself Mayur Anand Salunke ");
		
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[11]/input"));
		pass.sendKeys("mayur");
		
		Thread.sleep(1000);
		WebElement cpass = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[12]/input"));
		cpass.sendKeys("mayur");
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[13]/input"));
		submit.click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
