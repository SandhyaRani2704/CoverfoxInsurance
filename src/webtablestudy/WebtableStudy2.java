package webtablestudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebtableStudy2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement scrolltothis = driver.findElement(By.xpath("//h2[text()='Pagination Table']"));
		Actions act=new Actions(driver);
		act.scrollToElement(scrolltothis).perform();
		
		//only one header reading
		String text1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[2]")).getText();
        System.out.println("Header from coloumn 2 and row 1 is " +text1);
        
        System.out.println("====================================");
        
        //Reading one of the data from table
        String text2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]/td[3]")).getText();
	    System.out.println("Reading data from row 6 and coloumn 3 "+text2);
	    
	    System.out.println("====================================");
	    
	  //Read Complete Single Row header
	    List<WebElement> rowheader = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
	    for(WebElement rh:rowheader)
	    {
	    	System.out.print(rh.getText()+" ");
	    }
	    System.out.println();
	    
	    System.out.println("====================================");
	    
	    //Read Complete Single Coloumn
	    for(int i=2;i<=7;i++)
	    {
	    WebElement singlecoloumn = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));
	    System.out.println(singlecoloumn.getText());
	    }
	}

}
