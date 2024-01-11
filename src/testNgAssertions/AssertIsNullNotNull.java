package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertIsNullNotNull {
  @Test
  public void f() 
  {
	  String a="Ichalkaranji";
	  String b=null;
	  
	  //Verify a is not null
	  Assert.assertNotNull(a, "a is null,TC is failed");//message is shown only when TC is Faild
	  
	  //Verify b is null
	  Assert.assertNull(b, "b is not null,TC is faileds");
	  
  }
}
