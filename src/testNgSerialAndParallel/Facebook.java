package testNgSerialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
  @Test
  public void fb() 
  {
	  WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
  }
}
