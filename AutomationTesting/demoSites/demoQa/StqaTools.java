package demoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StqaTools {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://stqatools.com/demo/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[2]/td[2]/input"));
		name.sendKeys("Mayur");
		
		Thread.sleep(1000);
		WebElement fname = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[3]/td/input"));
		fname.sendKeys("Anand");
		
		Thread.sleep(1000);
		WebElement padd = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[4]/td/input"));
		padd.sendKeys("At Post Chakan");
		
		Thread.sleep(1000);
		WebElement peradd = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[5]/td/input"));
		peradd.sendKeys("Vishal Gardan");
		
		Thread.sleep(1000);
		WebElement gender = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[6]/td/input"));
		gender.click();
		
		Thread.sleep(1000);
		WebElement pincode = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[11]/td/input"));
		pincode.sendKeys("410501");
		
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[12]/td/input"));
		email.sendKeys("msalunke9437@gmail.com");
		
		Thread.sleep(2000);
		WebElement reset = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[13]/td/input"));
		reset.click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
