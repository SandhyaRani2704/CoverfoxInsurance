package softAssertUse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertstudy {
  @Test
  public void f() 
  {
	  SoftAssert s=new SoftAssert();
	  String a="Prachi";
	  String n="Om";
	  s.assertEquals(a,n, "a And n are not Equal,TC is Failed");
	  s.assertNull(n,"n is not null,TC is Failed");
	  s.assertAll();
  }
  @Test
  public void m()
  {
	  SoftAssert s1=new SoftAssert();
	  String b=null;
	  s1.assertNull(b,"b is not null ,TC is Failed");
  }
}
