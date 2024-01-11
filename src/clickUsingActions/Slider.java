package clickUsingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement slider = driver.findElement(By.id("slider"));
		Actions act=new Actions(driver);
		act.scrollToElement(slider);
		Thread.sleep(1000);
		act.dragAndDropBy(slider, 20, 0).perform();
		
	
	}

}
