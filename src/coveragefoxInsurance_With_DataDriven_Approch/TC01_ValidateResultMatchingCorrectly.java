package coveragefoxInsurance_With_DataDriven_Approch;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC01_ValidateResultMatchingCorrectly {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("D:\\Software Testing\\CoverFox.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("CoverFoxData");
		String ageData = mySheet.getRow(1).getCell(0).getStringCellValue();
		String pincodeData = mySheet.getRow(1).getCell(1).getStringCellValue();
		String ph_NumData=mySheet.getRow(1).getCell(2).getStringCellValue();
		
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
		Memberdetails1.SelectAgeFromDropDown(ageData);
		Memberdetails1.ClickOnMemberDetailsNextButton();
		
		CoverageFoxAddressDetails1 Addressdetails1=new CoverageFoxAddressDetails1(driver);
		Thread.sleep(2000);
		Addressdetails1.EnterPinCode(pincodeData);
		Addressdetails1.EnterPhoneNumber(ph_NumData);
		Addressdetails1.ClickOnContinueButton();
		
		CoverageFoxResultPage1 Result1=new CoverageFoxResultPage1(driver);
		Thread.sleep(4000);
		Result1.ValidateresultMatching();
		
	    
	
		
		
		
		
		



	}

}
