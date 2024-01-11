package popuphandlingpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException
	{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//span[text()='✕']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();

	}

}
