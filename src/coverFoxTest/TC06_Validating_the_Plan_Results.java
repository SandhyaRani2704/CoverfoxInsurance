package coverFoxTest;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import coverFoxPOM.CoverFoxAddressDetails;
import coverFoxPOM.CoverFoxHealthPlan;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxMemberDetailsPage;
import coverFoxPOM.CoverFoxResultPage;
import coverFoxUtility.Utility;
import coverfoxBase.Base;

@Listeners(listener.CoverFoxListener1.class)

public class TC06_Validating_the_Plan_Results extends Base {
     
	 CoverFoxHomePage home;
     CoverFoxHealthPlan health;
     CoverFoxMemberDetailsPage member;
     CoverFoxAddressDetails address;
     CoverFoxResultPage result;
     
     @Test
     public void Validating_TextResult_And_BannerResult() throws InterruptedException, IOException 
   	{
   		Thread.sleep(5000);
   		Reporter.log("Fetching Result From Text", true);
   		int textResult = result.AvailableResultsFromText();
   		Thread.sleep(5000);
   		Reporter.log("Fetching Result From Banner", true);
   		int BannerResult = result.AvailableResultfromBanner();
   		Thread.sleep(10000);
   		
   		Assert.assertEquals(textResult, BannerResult,"Text Result And Banner Result Are Not Matching,TC is Failed");
   		Reporter.log("TC is Passed", true);
   		//Utility.ScreenShot(driver, "TC06");
   	}
     
	@BeforeClass
	public void launchCoverFox() throws InterruptedException
	{
		LaunchCoverFoxBrowser();
		home=new CoverFoxHomePage(driver);
		health=new CoverFoxHealthPlan(driver);
		member=new CoverFoxMemberDetailsPage(driver);
		address=new CoverFoxAddressDetails(driver);
		result=new CoverFoxResultPage(driver);
	}
	@BeforeMethod
	public void enterMemberDetails() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("Clicking on Female Gender Button", true);
		home.ClickOnFemaleButton();
		Thread.sleep(3000);
		
		Reporter.log("Clicking on Health Plan Next Button", true);
		health.ClickOnHealthPlanNextButton();
		Thread.sleep(3000);
		
		
		
		Reporter.log("Selecting Age Drop Down", true);
		member.SelectAgeFromDropDown(Utility.ReadDataFromExcel(0, 0));
		Thread.sleep(3000);
		Reporter.log("Clicking on Member Details Next Button", true);
		member.ClickOnMemeberNextButton();
		Thread.sleep(3000);
				
		Reporter.log("Entering Pincode", true);
	    address.EnterPinCode(Utility.ReadDataFromExcel(0, 1));
//		Thread.sleep(3000);
		Reporter.log("Entering Phone Number", true);
	    address.EnterPhoneNumber(Utility.ReadDataFromExcel(0, 2));
		Thread.sleep(3000);
		Reporter.log("Clicking on Next Button", true);
	    address.ClickOnContinueButton();
		Thread.sleep(1000);
    }
	
	@AfterMethod
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		CloseCoverFox();
	}
}
