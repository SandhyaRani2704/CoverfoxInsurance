package dummyinsurancedomainproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceLogin 
{
   @FindBy(id = "login-form:email")private WebElement LoginEmailField;
   @FindBy(id = "login-form:password")private WebElement LoginPasswardField;
   @FindBy(xpath = "//input[@alt='Login']")private WebElement LoginButton;
   
   public InsuranceLogin(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void EnterEmailForLogin()
   {
	   LoginEmailField.sendKeys("sandhyaranikshirsagar@gmail.com");
   }
   public void EnterPasswardForLogin()
   {
	   LoginPasswardField.sendKeys("Sandhya@820");
   }
   public void ClickOnLogInButton()
   {
	   LoginButton.click();
   }
   

}
