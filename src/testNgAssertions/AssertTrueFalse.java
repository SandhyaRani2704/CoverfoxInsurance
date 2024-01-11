package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {
  @Test
  public void f() 
  {
	  boolean a=true;
	  boolean b=true;

       //Verify a is true
	  Assert.assertTrue(a, "a is Not True,Tc is failed");
	  
	  //verify b is false
	  Assert.assertFalse(b,"b is not false,TC is Failed");
	  
	  //Assert.assertFalse(b, "b is not false,TC is failed");
  }
}
