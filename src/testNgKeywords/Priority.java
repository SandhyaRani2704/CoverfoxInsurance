package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test (priority = 0)
  public void a() 
  {
	  Reporter.log("Test a is running", true);
  }
  @Test(priority = -2)
  public void b() 
  {
	  Reporter.log("Test b is running", true);
  }
  @Test(priority = 1)
  public void c() 
  {
	  Reporter.log("Test c is running", true);
  }
  @Test(priority = -1)
  public void d() 
  {
	  Reporter.log("Test d is running", true);
  }
}
