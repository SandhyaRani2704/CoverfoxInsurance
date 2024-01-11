package popuphandlingpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.name("alert")).click();
		Thread.sleep(1000);
		//switching focus from main page to alert popup
		Alert alt=driver.switchTo().alert();
		
		//use one of the alert abstract method 
		System.out.println(alt.getText());
		alt.accept();
		
}

}
