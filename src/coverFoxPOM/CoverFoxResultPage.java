package coverFoxPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CoverFoxResultPage 
{
	@FindBy(xpath = "//div[text()='49 matching Health Insurance Plans']")private WebElement resultsInString;;
    @FindBy(id = "plans-list")private List<WebElement> PlanList;
    @FindBy(xpath = "//div[text()='Sort Plans']")private WebElement textonpage;
    public CoverFoxResultPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public int AvailableResultsFromText()
    {
    	String test = resultsInString.getText();
    	String ar[]=test.split(" ");
    	String numberOfResultInString = ar[0];
    	int numberOfResultInInt = Integer.parseInt(numberOfResultInString);
        return numberOfResultInInt ;
    }
    
    public int AvailableResultfromBanner()
    {
    	int totalPlans = PlanList.size();
    	return totalPlans;
    	
    }
    
	public  void ValidateTextOfSortPlan()
    {
	    String ActualText = textonpage.getText();
    	String expectedtext="Sort Plans";
    	Assert.assertEquals(ActualText,expectedtext,"Text are Not matching ,TC Failed");
        Reporter.log("Text is Matching", true);
    }
}
