package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutKeyword {
  @Test(timeOut = 1)
  public void a() 
  {
	  Reporter.log("Calss A is running", true);
  }
}
