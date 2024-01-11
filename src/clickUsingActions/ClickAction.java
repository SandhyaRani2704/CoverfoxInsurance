package clickUsingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//1.find out the locator of webElement where we need to perform action and store in some reference variable

		WebElement login = driver.findElement(By.name("login"));
		
		//2.Create an Object of an Actions class which will accept driver object as a parameter
		Actions act=new Actions(driver);
		
		//3.using one of the Actions class methods perform an action
		act.moveToElement(login).perform();
		act.click().perform();
		
		//act.moveToElement(login).click().build().perform();
		
		//act.click().perform();
	}

}
