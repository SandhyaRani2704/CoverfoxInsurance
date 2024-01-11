package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
//variables
	@FindBy(name = "checkout")private WebElement checkoutButton;
//contructor
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//methods
	public void ClickOnCheckout()
	{
         checkoutButton.click();
	}
	

}
