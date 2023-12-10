package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChormeB {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	    // get title
		String abc = driver.getTitle();
		System.out.println(abc);
		
		// get current url
		String a1 = driver.getCurrentUrl();
		System.out.println(a1);
		
		// get page source code
		String a2 = driver.getPageSource();
		System.out.println(a2);
		
		
		
	}
	
}
