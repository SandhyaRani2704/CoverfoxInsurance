package mouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement drag = driver.findElement(By.xpath("//p[contains(text(),'Drag')]"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
	    Actions act=new Actions(driver);
	    
	    //act.dragAndDrop(drag, drop).perform();
	    
	    act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();

	}

}
