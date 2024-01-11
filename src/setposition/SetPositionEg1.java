package setposition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		Point defaultposition = driver.manage().window().getPosition();
		System.out.println(defaultposition);
		
		Point p=new Point(280, -100);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		Thread.sleep(7000);
		Point p1=new Point(-280, 100);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p1);
		

	}

}
