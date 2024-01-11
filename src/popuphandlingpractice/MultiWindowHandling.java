package popuphandlingpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.naukri.com/");
        driver.findElement(By.linkText("Software & IT")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("MNC")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Project Mgmt")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("HR")).click();
        Thread.sleep(1000);
        
        Set<String> allwindowids = driver.getWindowHandles();
        
        
        
	}

}
