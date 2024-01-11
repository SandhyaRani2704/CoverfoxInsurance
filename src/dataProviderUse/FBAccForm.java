package dataProviderUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FBAccForm {
  
  @Test(dataProvider = "FBRegression" ,dataProviderClass = FBDataProvider.class)
  public void FBTest(String firstName,String lastName,String MobNum)
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.linkText("Create new account")).click();
	 driver.findElement(By.name("firstname")).sendKeys(firstName);
	 driver.findElement(By.name("lastname")).sendKeys(lastName);
	 driver.findElement(By.name("reg_email__")).sendKeys(MobNum);
	  
  }
}
