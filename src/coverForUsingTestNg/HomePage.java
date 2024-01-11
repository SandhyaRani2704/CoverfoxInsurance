package coverForUsingTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//div[text()='Female']") private WebElement GenderSelection;
	@FindBy(xpath = "//input[@type='tel']")private WebElement mobilenumber;
	@FindBy(xpath = "//button[text()='Get Started']") private WebElement GetStartedButton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SelectGender()
	{
		GenderSelection.click();
	}

}
