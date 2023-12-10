package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		WebElement fn = driver.findElement(By.name("firstname"));
		
		fn.sendKeys("Mayur");
		
		WebElement ln = driver.findElement(By.name("lastname"));
		
		ln.sendKeys("Salunke");
		
		WebElement mno = driver.findElement(By.name("reg_email__"));
		
		mno.sendKeys("9075019437");
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		
		pass.sendKeys("mayur");
		
		
		
	}
}
