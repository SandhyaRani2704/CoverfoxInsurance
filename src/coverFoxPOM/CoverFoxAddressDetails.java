package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetails 
{
	@FindBy(xpath = "(//input[@inputmode='numeric'])[1]")private WebElement pinCode;
	@FindBy(xpath = "(//input[@inputmode='numeric'])[2]")private WebElement PhNum;
    @FindBy(className = "next-btn")private WebElement continueButton;
	public CoverFoxAddressDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPinCode(String pin)
	{
		pinCode.sendKeys(pin);
	}
	public void EnterPhoneNumber(String Num) 
	{
		PhNum.sendKeys(Num);
	}
	public void ClickOnContinueButton()
	{
		continueButton.click();
	}
}
