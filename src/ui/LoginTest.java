package ui;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
  @BeforeTest
  public void loginTest() 
  {
	  Reporter.log("Login Sucessfully", true);
  }
  @Test
  public void test1()
  {
	  Reporter.log("test1", true);
  }
  @Test
  public void test2()
  {
	  Reporter.log("test2", true);
  }
  @AfterTest
  public void logOutTest()
  {
	  Reporter.log("Logged out sucessfully", true);
  }
  @BeforeMethod
  public void ConnectToDB()
  {
	  Reporter.log("Connedted to DB", true);
  }
  @AfterMethod
  public void DisconnectFromDB()
  {
	  Reporter.log("Disconnected from DB", true);
  }
}
