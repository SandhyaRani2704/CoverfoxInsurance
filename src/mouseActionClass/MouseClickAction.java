package mouseActionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickAction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("https://www.facebook.com/");
		
        //1.find Element to be act
        
        WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Log in']"));
        
		
		/*2.To take mouse actions, need to create object of Actions 
		class and pass webDriver object as parameter */
 
        Actions act=new Actions(driver);
        
        //3.using one of the Actions class methods perform an action
        //act.moveToElement(loginbutton).click().build().perform();
        
                      /*OR*/
        
        /*act.moveToElement(loginbutton).perform();
        act.click().perform();*/
                     
                      /*OR*/
        
        act.click(loginbutton).perform();
        
      
        

	}

}
