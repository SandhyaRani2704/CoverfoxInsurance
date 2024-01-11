package coverfoxInsurance_Withthout_DataDriven_Approch;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC01_ValidateResultMathingCorrectly {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		HomePage home=new HomePage(driver);
		Thread.sleep(5000);
		home.ClickonFemaleButton();
		//home.EnterMobileNumber();
		//home.ClickOnGetStartedButton();
		
		
		CoverageFoxHealthPlanPage healthpage=new CoverageFoxHealthPlanPage(driver);
		Thread.sleep(5000);
		healthpage.ClickOnHealthplanNextButton();
		
		CoverageFoxMemberDetailsPage member=new CoverageFoxMemberDetailsPage(driver);
		Thread.sleep(5000);
		member.SelectAgeFromDropDown();
		member.ClickOnMemberDetailsNextButton();
		
		CoverageFoxAddressDetails address=new CoverageFoxAddressDetails(driver);
		Thread.sleep(5000);
		address.EnterPinCode();
		address.EnterPhoneNumber();
		address.ClickOnContinueButton();
		
		CoverageFoxResultPage resultpage=new CoverageFoxResultPage(driver);
		Thread.sleep(5000);
		resultpage.ValidateresultMatching();
		

	}

}
