package coverfoxInsurance_Withthout_DataDriven_Approch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverageFoxMemberDetailsPage 
{
       @FindBy(id = "Age-You")private WebElement AgeDropDown;
       @FindBy(className = "next-btn")private WebElement MemberDetailsNextButton;
       
   public CoverageFoxMemberDetailsPage(WebDriver driver)
    {
    	   PageFactory.initElements(driver, this);
    }
   
   public void SelectAgeFromDropDown()
   {
	   Select sage=new Select(AgeDropDown);
	   sage.selectByValue("23y");
   }
   public void ClickOnMemberDetailsNextButton() 
   {
	MemberDetailsNextButton.click();
   }
     
}
