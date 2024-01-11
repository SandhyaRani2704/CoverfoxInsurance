package mouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(500);
		
		//1.Find the element which we have to right click
		
		WebElement rightclickbutton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		//create action class and pass webdriver parameter
		
		Actions act=new Actions(driver);
		
		//use right click method of action class
		
		//act.moveToElement(rightclickbutton).doubleClick().build().perform();
		
		act.doubleClick(rightclickbutton).build().perform();

	}

}
