package coveragefoxInsurance_With_DataDriven_Approch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverageFoxMemeberDetails1
{
	 @FindBy(id = "Age-You")private WebElement AgeDropDown;
     @FindBy(className = "next-btn")private WebElement MemberDetailsNextButton;
     
 public CoverageFoxMemeberDetails1 (WebDriver driver)
  {
  	   PageFactory.initElements(driver, this);
  }
 
 public void SelectAgeFromDropDown(String age)
 {
	   Select sage=new Select(AgeDropDown);
	   sage.selectByValue(age+"y");
 }
 public void ClickOnMemberDetailsNextButton() 
 {
	MemberDetailsNextButton.click();
 }
}
