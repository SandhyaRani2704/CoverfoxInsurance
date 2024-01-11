package popuphandlingpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       Thread.sleep(1000);
	       driver.get(" https://skpatro.github.io/demo/links/");
	       driver.findElement(By.name("NewWindow")).click();
	       //get ids of all window
	       Set<String> allwindowids = driver.getWindowHandles();
	       System.out.println(allwindowids);
	       
	       //switching focus from main window to child window
	       Iterator<String> it = allwindowids.iterator();
	       String mainpage = it.next();
	       String childpage = it.next();
	       Thread.sleep(1000);
	       driver.switchTo().window(childpage);
	       //do some actions on child page
	       driver.manage().window().maximize();
	       Thread.sleep(1000);
	       WebElement scrolltothis = driver.findElement(By.linkText("Contact me"));
	       Actions act=new Actions(driver);
	       act.scrollToElement(scrolltothis);
	       Thread.sleep(1000);
	       scrolltothis.click();
	       
	       

	}

}
