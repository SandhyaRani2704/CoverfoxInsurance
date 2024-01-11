package mouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickRightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		//example for right click(context click)
		WebElement rightclickbutton = driver.findElement(By.xpath(" //span[contains(text(),'right')]"));
        
		//Create action class and pass webdriver argument
		Actions act=new Actions(driver);
		
		//use the context click method
		act.contextClick(rightclickbutton).perform();
	}

}
