package dummyinsurancedomainproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InsuranceSignUpPage 
{
@FindBy(id = "signup:fname")private WebElement FirstNameField;
@FindBy(id = "signup:lname")private WebElement LastNameField;
@FindBy(id = "BirthDate")private WebElement BirthDateField;
@FindBy(id = "signup:email")private WebElement EmailField;
@FindBy(id = "signup:street")private WebElement MailingField;
@FindBy(id = "signup:city")private WebElement CityField;
@FindBy(id = "signup:state")private WebElement StateDropDownField;
@FindBy(id = "signup:zip")private WebElement PostalField;
@FindBy(id="signup:password")private WebElement PasswardField;
@FindBy(id="signup:signup") private WebElement SignUpPageSignUpButton;

public InsuranceSignUpPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void EnterFirstName()
{
	FirstNameField.sendKeys("Sandhyarani");
}

public void EnterLastName()
{
	LastNameField.sendKeys("Kshirsagar");
}
public void EnterBirthDate()
{
	BirthDateField.sendKeys("27/04/2000");
}
public void EnterEmail()
{
	EmailField.sendKeys("sandhyaranikshirsagar@gmail.com");
}
public void EnterMailing()
{
	MailingField.sendKeys("Pune");
}
public void EnterCity()
{
	CityField.sendKeys("Ichalkaranji");
}
public void SelectStateFromDropDown()
{
	Select sstate=new Select(StateDropDownField);
	sstate.selectByVisibleText("California");
}
public void EnterPostalCode()
{
	PostalField.sendKeys("416115");
}
public void EnterPassward()
{
	PasswardField.sendKeys("Sandhya@820");
}
public void ClickOnSignUpPageSignUpButton()
{
	SignUpPageSignUpButton.click();
}

}
