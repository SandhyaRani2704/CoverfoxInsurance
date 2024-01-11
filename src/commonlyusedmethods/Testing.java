package commonlyusedmethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		CommonlyUsedMethods.implicitwait(driver, 3);
		driver.get("https://ttdevasthanams.ap.gov.in/home/dashboard");
		WebElement termsandconditions = driver.findElement(By.xpath("//span[text()='Terms and conditions']"));
        CommonlyUsedMethods.scrollintoview(driver, termsandconditions);
        CommonlyUsedMethods.takeScreenshot(driver, "TTEDG");
	}

}
