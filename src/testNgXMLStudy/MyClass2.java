package testNgXMLStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
	@Test
	  public void TC6() 
	  {   Assert.fail();
		  Reporter.log("TC6 is running", true);
	  }
	@Test
	  public void TC7() 
	  {
		  Reporter.log("TC7 is running", true);
	  }
	@Test
	  public void TC8() 
	  {
		  Reporter.log("TC8 is running", true);
	  }
}
