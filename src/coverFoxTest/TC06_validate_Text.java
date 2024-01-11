package coverFoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import coverFoxPOM.CoverFoxAddressDetails;
import coverFoxPOM.CoverFoxHealthPlan;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxMemberDetailsPage;
import coverFoxPOM.CoverFoxResultPage;
import coverFoxUtility.Utility;
import coverfoxBase.Base;

public class TC06_validate_Text extends Base
{
	 CoverFoxHomePage home;
	  CoverFoxHealthPlan health;
	  CoverFoxMemberDetailsPage member;
	  CoverFoxAddressDetails address;
	  CoverFoxResultPage result;
  @BeforeClass
  public void launchingBrowser() throws InterruptedException
  {
	 LaunchCoverFoxBrowser();
	 home=new CoverFoxHomePage(driver);
	 health=new CoverFoxHealthPlan(driver);
	 member=new CoverFoxMemberDetailsPage(driver);
	 address=new CoverFoxAddressDetails(driver);
	 result=new CoverFoxResultPage(driver);
  }
  @BeforeMethod
  public void Enter_Member_Details() throws InterruptedException, EncryptedDocumentException, IOException
  {
	    Reporter.log("Clicking on Female Gender Button", true);
		home.ClickOnFemaleButton();
		Thread.sleep(3000);
		
		Reporter.log("Clicking on Next Button", true);
		health.ClickOnHealthPlanNextButton();
		Thread.sleep(3000);
		
		Reporter.log("Selecting Age From Drop Down", true);
		member.SelectAgeFromDropDown(Utility.ReadDataFromExcel(0, 0));
		Thread.sleep(3000);
		Reporter.log("Clicking on next button", true);
		member.ClickOnMemeberNextButton();
		Thread.sleep(3000);

		Reporter.log("Entering Pin Code", true);
		address.EnterPinCode(Utility.ReadDataFromExcel(0, 1));
		Thread.sleep(3000);
		Reporter.log("Entering phone Number", true);
		address.EnterPhoneNumber(Utility.ReadDataFromExcel(0, 2));
		Thread.sleep(3000);
		address.ClickOnContinueButton();
		Thread.sleep(1000);
	}
 
  @Test
  public void TC06_Validating_The_text() throws InterruptedException 
  {
	  Thread.sleep(4000);
	  Reporter.log("Validating Text", true);
	  result.ValidateTextOfSortPlan();
	  
  }
  

//	@AfterMethod
//	public void CloseBrowser() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		CloseCoverFox();
//	}
}
