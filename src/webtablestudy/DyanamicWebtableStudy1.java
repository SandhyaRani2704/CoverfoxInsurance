package webtablestudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicWebtableStudy1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //read the header elements
        int numofrows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
        int numofcoloumns = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr/th")).size();
        
        
        

	}

}
