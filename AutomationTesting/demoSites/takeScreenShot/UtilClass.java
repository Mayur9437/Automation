package takeScreenShot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass {
	
	//--------------------------------TakeScreenShot-----------------------------------
	public static void takeScreenShot(WebDriver driver,String Filename) throws IOException
	{
		
		String path = "C:\\Users\\My Pc\\eclipse-workspace\\AutomationTesting\\ScreenShots";
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path+Filename+System.currentTimeMillis()+".png");
		FileHandler.copy(src, des);


	}

	
	
	
	
	
	
	
}
