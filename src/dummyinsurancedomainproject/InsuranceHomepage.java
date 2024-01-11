package dummyinsurancedomainproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceHomepage 
{
    @FindBy(id = "login-form:signup") private WebElement HomePageSignUpbutton;
    
    public InsuranceHomepage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void ClickonHomePageSignUpButton()
    {
    	HomePageSignUpbutton.click();
    }
}
