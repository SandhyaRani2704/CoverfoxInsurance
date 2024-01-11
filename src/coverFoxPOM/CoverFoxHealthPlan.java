package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlan 
{
	@FindBy(className = "next-btn") private WebElement healthPlanNextButton;
	
	public CoverFoxHealthPlan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnHealthPlanNextButton()
	{
		healthPlanNextButton.click();
	}

}
