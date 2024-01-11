package dummyinsurancedomainproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_ValidateLogInSucessfully {

	public static void main(String[] args) 
	{
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demo.borland.com/InsuranceWebExtJS/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       //Click On Sign Up Button 
//	       InsuranceHomepage home=new InsuranceHomepage(driver);
//	       home.ClickonHomePageSignUpButton();
	       //Sign Up Credentials
//	       InsuranceSignUpPage signUp=new InsuranceSignUpPage(driver);
//	       signUp.EnterFirstName();
//	       signUp.EnterLastName();
//	       signUp.EnterBirthDate();
//	       signUp.EnterEmail();
//	       signUp.EnterMailing();
//	       signUp.EnterCity();
//	       signUp.SelectStateFromDropDown();
//	       signUp.EnterPostalCode();
//	       signUp.EnterPassward();
//	       signUp.ClickOnSignUpPageSignUpButton();
	       
	       InsuranceLogin login=new InsuranceLogin(driver);
	       login.EnterEmailForLogin();
	       login.EnterPasswardForLogin();
	       login.ClickOnLogInButton();

	}

}
