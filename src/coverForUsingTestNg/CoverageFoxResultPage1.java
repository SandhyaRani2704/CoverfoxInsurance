package coverForUsingTestNg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverageFoxResultPage1 
{
	@FindBy(xpath = "//div[contains(text(),'matching Health')]")private WebElement ResultInString1;
    @FindBy(className = "pcc-main")private List<WebElement> PlansList1;
    
    public CoverageFoxResultPage1(WebDriver driver)
    {
   	 PageFactory.initElements(driver, this);
    }
    
    public int availableResultInText()
    {
   	String test = ResultInString1.getText();
   	System.out.println(test);
   	String[] ar=test.split(" ");
   	String numberOfresultMatching = ar[0];
   	
   	//Convert String to Integer
   	int numberOfresultInInt = Integer.parseInt(numberOfresultMatching);
   	//System.out.println(numberOfresultInInt);
   	return numberOfresultInInt;
    }
    public int availableResultOnBanner() 
    {
   	int totalNumberOfResultonbanner=PlansList1.size();
   	return totalNumberOfResultonbanner;
   	
    }
}
