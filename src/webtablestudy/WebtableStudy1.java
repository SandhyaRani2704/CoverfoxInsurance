package webtablestudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebtableStudy1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement scrolltothis = driver.findElement(By.xpath("//h2[text()='Pagination Table']"));
		Actions act=new Actions(driver);
		act.scrollToElement(scrolltothis).perform();
		
		//how many rows in table
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int rowsize = row.size();
        System.out.println("Number of rows in following table are " +rowsize);
        System.out.println("============================");
        //how many coloumns in table
        List<WebElement> coloumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
	    int coloumnsize = coloumn.size();
	    System.out.println("Number of coloumns in following table are "+coloumnsize);
	    System.out.println("============================");
	}

}
