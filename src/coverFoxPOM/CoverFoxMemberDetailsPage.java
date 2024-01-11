package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetailsPage 
{
	@FindBy(id = "Age-You") private WebElement drpdwn;
	@FindBy(className = "next-btn")private WebElement MemberPageNextButton;

	public CoverFoxMemberDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SelectAgeFromDropDown(String age)
	{
		Select sage=new Select(drpdwn);
		sage.selectByValue(age+"y");
	}
	public void ClickOnMemeberNextButton()
	{
		MemberPageNextButton.click();
	}
}
