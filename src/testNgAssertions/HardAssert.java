package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void f() 
  {
	  String a="Pune";
	  String b="Pune";
	  Assert.assertEquals(a,b,"a and b are not equal, TC are false");
      Assert.assertNotNull(b,"a is null,TC is Failed");
  }
  
}
