package coverForUsingTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_Validate_The_Results_Matching {
  WebDriver driver;
  HomePage home;
  CoverageFoxHealthPlanPage healthPlan;
  CoverageFoxMemeberDetails1 MemberDetails;
  CoverageFoxAddressDetails1 AddressDetails;
  CoverageFoxResultPage1 ResultPage;
  
	@BeforeClass
	public void LaunchBrowser()
	{
		driver=new ChromeDriver();
		home=new HomePage(driver);
		healthPlan=new CoverageFoxHealthPlanPage(driver);
		MemberDetails=new CoverageFoxMemeberDetails1(driver);
	    AddressDetails=new CoverageFoxAddressDetails1(driver);
	    ResultPage=new CoverageFoxResultPage1(driver);
	    
	    Reporter.log("Launching Browser", true);
	    driver.get("https://www.coverfox.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@BeforeMethod
	public void enterMemberDetails() throws InterruptedException
	{
		Reporter.log("Clicking on Gender Button", true);
	    home.SelectGender();
	    Thread.sleep(1000);
	    
	    Reporter.log("Clicking on Next Button", true);
	    healthPlan.ClickOnHealthplanNextButton();
	    Thread.sleep(1000);
	    
	    Reporter.log("Select Age From Dropdown", true);
	    MemberDetails.SelectAgeFromDropDown("23");
	    MemberDetails.ClickOnMemberDetailsNextButton();
	    Thread.sleep(1000);
	    
	    Reporter.log("Entering Pincode", true);
	    AddressDetails.EnterPinCode("416115");
	    Reporter.log("Entering phone Number", true);
	    AddressDetails.EnterPhoneNumber("8674563920");
	    Reporter.log("Clicking on Continue Button");
	    AddressDetails.ClickOnContinueButton();
	    Thread.sleep(1000);
	}
	@Test
  public void ValidatingTestPlansFromTextAndBanner() throws InterruptedException
  
  {   Thread.sleep(5000);
	  Reporter.log("Fetching Number of result from text",true);
	  int textResult = ResultPage.availableResultInText();
	  Reporter.log("Fetching Number of result from Banner", true);
	  int bannerResult = ResultPage.availableResultOnBanner();
	  Assert.assertEquals(textResult, bannerResult,"text Result is not matching with Banner Result,Test case is Failed");
      
	  Reporter.log("TC IS PASSED",true);
  
  }
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		
		Reporter.log("Closing Browser", true);
		Thread.sleep(1000);
		driver.close();
	}
}
