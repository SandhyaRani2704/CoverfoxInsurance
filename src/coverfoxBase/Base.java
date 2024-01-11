package coverfoxBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 
{
   protected static WebDriver driver;  
	
	public void LaunchCoverFoxBrowser() throws InterruptedException
	{   Reporter.log("Launcing CoverFox", true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		Thread.sleep(2000);
	}
	
	public void CloseCoverFox() throws InterruptedException
	{   Reporter.log("Closing CoverFox", true);
	    Thread.sleep(2000);
		driver.close();
		
	}
}
