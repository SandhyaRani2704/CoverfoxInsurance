package webtablestudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class DyanamicWebtableStudy {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		int numofrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int numofcol = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
        System.out.println(numofrows);
        System.out.println(numofcol);
        System.out.println("=================================");
        for(int i=1;i<numofrows;i++)
        {
        	for(int j=1;j<numofcol;j++)
        	{
        		if(i==1)
        		{
        			WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
        			System.out.print(data.getText() +" ");
        		}
        		else
        		{
        			WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
        			System.out.print(data.getText()+" ");
        		}
        	}
        	System.out.println();
            System.out.println("=================================");
        }
        
	}

}
