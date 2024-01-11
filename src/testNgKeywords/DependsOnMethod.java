package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test
  public void a() 
  {
	  Reporter.log("Test case a is running", true);
  }
  @Test(dependsOnMethods = "d")
  public void b() 
  {
	  Reporter.log("Test case b is running", true);
  }
  @Test(priority = 1)
  public void c() 
  {
	  Reporter.log("Test case c is running", true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("Test case d is running", true);
  }
}
