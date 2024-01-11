package crossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CBTest {
  @Parameters("bName")
  @Test
  public void f(String browsername) 
  {
	  WebDriver driver=null;
	  if(browsername.equals("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(browsername.equals("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.linkText("Create new account")).click();
	 driver.findElement(By.name("firstname")).sendKeys("Sandhyarani");
	 driver.findElement(By.name("lastname")).sendKeys("Kshirsagar");
	 driver.findElement(By.name("reg_email__")).sendKeys("8208833940");
	  
  }
}
