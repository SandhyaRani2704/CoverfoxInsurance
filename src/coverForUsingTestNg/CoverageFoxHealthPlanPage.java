package coverForUsingTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverageFoxHealthPlanPage 
{
	@FindBy(className="next-btn") private WebElement HealthplanNextButton;

	public CoverageFoxHealthPlanPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickOnHealthplanNextButton()
	{
		HealthplanNextButton.click();
	}

}
