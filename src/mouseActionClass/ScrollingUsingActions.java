package mouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ScrollingUsingActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement scountry = driver.findElement(By.id("country"));
		Select s=new Select(scountry);
		s.selectByValue("india");
		
		Actions act=new Actions(driver);
		act.scrollToElement(scountry).perform();
		
		

	}

}
