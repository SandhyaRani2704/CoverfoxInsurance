package coveragefoxInsurance_With_DataDriven_Approch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverageFoxAddressDetails1 
{
	 @FindBy(xpath = "//input[@inputmode='numeric']") private WebElement PinCode;
	    @FindBy(xpath = "(//input[@inputmode='numeric'])[2]")private WebElement PhoneNumber;
	    @FindBy(xpath = "//div[text()='Continue']")private WebElement ContinueButton;
	    
	    public CoverageFoxAddressDetails1(WebDriver driver)
	     {
		    PageFactory.initElements(driver, this);
	     }
	    
	    public void EnterPinCode(String pincode)
	    {
	    	PinCode.sendKeys(pincode);
	    }
	   
	    public void EnterPhoneNumber(String ph_Num)
	    {
	    	PhoneNumber.sendKeys(ph_Num);
	    }
	    public void ClickOnContinueButton()
	    {
	    	ContinueButton.click();
	    }

}
