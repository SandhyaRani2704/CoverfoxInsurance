package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountKeywordStudy {
  @Test
  public void f() 
  {
	  Reporter.log("Test Case a is running", true);
  }
  @Test(invocationCount = 4)
  public void b() 
  {
	  Reporter.log("Test Case b is running", true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("Test Case b is running", true);
  }
}
