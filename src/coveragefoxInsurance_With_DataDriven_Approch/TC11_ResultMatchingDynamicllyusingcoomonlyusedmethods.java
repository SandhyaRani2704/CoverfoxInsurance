package coveragefoxInsurance_With_DataDriven_Approch;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonlyusedmethods.CommonlyUsedMethods;

public class TC11_ResultMatchingDynamicllyusingcoomonlyusedmethods {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		HomePage home=new HomePage(driver);
		Thread.sleep(2000);
		home.SelectGender();
		
		CoverageFoxHealthPlanPage health=new CoverageFoxHealthPlanPage(driver);
		Thread.sleep(2000);
		health.ClickOnHealthplanNextButton();
		
		CoverageFoxMemeberDetails1 Memberdetails1=new CoverageFoxMemeberDetails1(driver);
		Thread.sleep(2000);
		Memberdetails1.SelectAgeFromDropDown(CommonlyUsedMethods.readDataFromExcel("CoverFoxData", 1, 0));
		Memberdetails1.ClickOnMemberDetailsNextButton();
		
		CoverageFoxAddressDetails1 adress1=new CoverageFoxAddressDetails1(driver);
		Thread.sleep(20000);
		adress1.EnterPinCode(CommonlyUsedMethods.readDataFromExcel("CoverFoxData", 1, 1));
		adress1.EnterPhoneNumber(CommonlyUsedMethods.readDataFromExcel("CoverFoxData", 1, 2));
		adress1.ClickOnContinueButton();
		
		CoverageFoxResultPage1 result2=new CoverageFoxResultPage1(driver);
		Thread.sleep(5000);
		result2.ValidateresultMatching();

	}

}
