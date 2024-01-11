package coverfoxInsurance_Withthout_DataDriven_Approch;

import java.util.ArrayList;
import java.util.List;

import org.etsi.uri.x01903.v13.IntegerListType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverageFoxResultPage 
{
     @FindBy(xpath = "//div[contains(text(),'matching Health')]")private WebElement ResultInString;
     @FindBy(className = "pcc-main")private List<WebElement> PlansList;
     
     public CoverageFoxResultPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public void ValidateresultMatching()
     {
    	String test = ResultInString.getText();
    	String[] ar=test.split(" ");
    	String numberOfresultMatching = ar[0];
    	//Convert String to Integer
    	int numberOfresultInInt = Integer.parseInt(numberOfresultMatching);
    	
    	int totalNumberOfResult=PlansList.size();
    	if(numberOfresultInInt==totalNumberOfResult)
    	{
    		System.out.println("Test Case is Passed");
    	}
    	else
    	{
    		System.out.println("Test Case Failed");
    	}
    	
    	
     }
}
