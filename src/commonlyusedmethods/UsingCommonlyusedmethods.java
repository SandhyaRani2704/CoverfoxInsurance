package commonlyusedmethods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCommonlyusedmethods {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    CommonlyUsedMethods.implicitwait(driver, 2);
		driver.get("https://www.amazon.in/ref=nav_logo");
		CommonlyUsedMethods.takeScreenshot(driver, "amazon");
	}

}
