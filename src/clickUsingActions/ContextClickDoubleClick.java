package clickUsingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    Thread.sleep(100);
	    //right click
	    WebElement rightclickbutton = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
	    //create actions class
	    Actions act=new Actions(driver);
	   // act.moveToElement(rightclickbutton).click().build().perform();
	    
	    act.contextClick(rightclickbutton).perform();
	    Thread.sleep(1000);
	    
	    //double click
	    WebElement doubleclickbutton = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
	    Actions act1=new Actions(driver);
	    act1.doubleClick(doubleclickbutton).perform();
	    
	    
	    
}

}
