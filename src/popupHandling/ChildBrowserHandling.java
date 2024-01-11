package popupHandling;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ChildBrowserHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
        System.out.println(text.getText());
        driver.findElement(By.name("NewWindow")).click();
        Set<String> allwindows = driver.getWindowHandles();
        System.out.println(allwindows);
        Iterator<String> it = allwindows.iterator();
        String mainpageid = it.next();
        String childpageid = it.next();
        System.out.println(mainpageid);
        System.out.println(childpageid);
        
        driver.switchTo().window(childpageid);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Pop Up ex");
        Thread.sleep(5000);
        String expectedresult = "About me";
        String actualresult = driver.findElement(By.xpath("//h1[text()='About me']")).getText();
        System.out.println(actualresult);
        Thread.sleep(1000);
        if(expectedresult.equals(actualresult))
        {
        	System.out.println("Result is correct");
        }
        
        
      
			
			
	}

}
