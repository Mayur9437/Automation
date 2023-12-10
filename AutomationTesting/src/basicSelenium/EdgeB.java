package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeB {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// get title 
		String a =driver.getTitle();
		System.out.println(a);
		
		// get current url
		String a1 = driver.getCurrentUrl();
		System.out.println(a1);
		
		// get page source code 
		String a2 = driver.getPageSource();
		System.out.println(a2);
		
		
	}
}
