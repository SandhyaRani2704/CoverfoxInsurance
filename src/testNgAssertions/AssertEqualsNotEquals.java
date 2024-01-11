package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsNotEquals {
  @Test
  public void asserteuals() 
  {
	  //verify a and b are equal
//	  int a=10;
//	  int b=10;
//	  
//	  Assert.assertEquals(a,b,"A and B are Not equal test case is failed");
	  
//	  int a=1;
//	  int b=2;
//	  
//	  Assert.assertEquals(a,b,"A and B are Not equal test case is failed");
  
	  //verify a and b are not equal
	  
//	  String c="Pune";
//	  String d="Mumbai";
//	  Assert.assertNotEquals(c,d,"C and D Are equal test case is failed" );

	  String c="Pune";
	  String d="Pune";
	  Assert.assertNotEquals(c,d,"C and D Are equal test case is failed" );
  
  }
}
