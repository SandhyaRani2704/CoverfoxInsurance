package coverfoxInsurance_Withthout_DataDriven_Approch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverageFoxAddressDetails 
{
    @FindBy(xpath = "//input[@inputmode='numeric']") private WebElement PinCode;
    @FindBy(xpath = "(//input[@inputmode='numeric'])[2]")private WebElement PhoneNumber;
    @FindBy(xpath = "//div[text()='Continue']")private WebElement ContinueButton;
    
    public CoverageFoxAddressDetails(WebDriver driver)
     {
	    PageFactory.initElements(driver, this);
     }
    
    public void EnterPinCode()
    {
    	PinCode.sendKeys("416115");
    }
   
    public void EnterPhoneNumber()
    {
    	PhoneNumber.sendKeys("8208833940");
    }
    public void ClickOnContinueButton()
    {
    	ContinueButton.click();
    }

}

