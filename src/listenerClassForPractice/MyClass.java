package listenerClassForPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listeners.class)

public class MyClass {
  @Test
  public void A() 
  {
	  Reporter.log("Hi A is Running", true);
  }
  @Test
  public void B()
  {   Assert.fail();
	  Reporter.log("Hi B is Running", true);
  }
  @Test (dependsOnMethods = {"B"})
  public void C()
  {
	  Reporter.log("Hi C is Running", true);
  }
  @Test
  public void D()
  {
	  Reporter.log("Hi D is Running", true);
  }
}
