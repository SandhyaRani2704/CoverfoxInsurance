package keyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ArrowDownUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new ')]")).click();
		Thread.sleep(2000);
	     WebElement day = driver.findElement(By.id("day"));
	     
	     Actions act=new Actions(driver);
	     for(int i=0;i<10;i++)
	     {
	     act.sendKeys(day, Keys.ARROW_UP).build().perform();
	     Thread.sleep(1000);
	     }
         act.sendKeys(Keys.ENTER).perform();
         
         Thread.sleep(2000);
         for(int j=0;j<10;j++)
         {
        	 act.sendKeys(day, Keys.ARROW_DOWN).build().perform();
        	 Thread.sleep(500);
         }
         act.sendKeys(Keys.ENTER).perform();
         Thread.sleep(1000);
         WebElement firstnameField = driver.findElement(By.name("firstname"));
         
         act.sendKeys(firstnameField, "SANDHYARANI").perform();
         Thread.sleep(1000);
         WebElement lastnamefield = driver.findElement(By.name("lastname"));
         
         //act.keyDown(lastnamefield,Keys.SHIFT).sendKeys("kshirsagar").build().perform();
         
         act.keyDown(lastnamefield, Keys.SHIFT).sendKeys("k").keyUp(Keys.SHIFT).sendKeys("shirsagar").build().perform();
         
         
}
}
