package saucedemo;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{  
	//variables 
   @FindBy (id = "user-name") private WebElement userNameField;
   @FindBy(id = "password") private WebElement passwardField;
   @FindBy(xpath = "//input[@name='login-button']")private WebElement loginButton;

   //constructor
  public LoginPage(WebDriver driver)
  {

	PageFactory.initElements(driver, this);
  }
  //methods
  public void enterUserName()
  {
	  userNameField.sendKeys("standard_user");
  }
  public void enterPassword()
  {
	  passwardField.sendKeys("secret_sauce");
  }
  public void ClickOnLoginButton()
  {
	  loginButton.click();;
  }
 
   

}
