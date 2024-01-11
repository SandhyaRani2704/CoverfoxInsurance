package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://in.bookmyshow.com/");
	     File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         String rs = RandomString.make(4);
         File dest=new File("C:\\Users\\sandh\\OneDrive\\Pictures\\Screenshots\\bookmyshow"+rs+".png");
         FileHandler.copy(source, dest);

	}

}
