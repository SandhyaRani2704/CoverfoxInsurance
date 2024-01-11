package dataProviderUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class FBAccFormUsingXMLData {
	 @Parameters({"fName","lName","mNum"})
	@Test
 
  public void fbTest(String firstName,String lastName,String MobNum) 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	     driver.findElement(By.linkText("Create new account")).click();
		 driver.findElement(By.name("firstname")).sendKeys(firstName);
		 driver.findElement(By.name("lastname")).sendKeys(lastName);
		 driver.findElement(By.name("reg_email__")).sendKeys(MobNum);
		  
  }
}
