package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage 
{
    //variables
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")private WebElement FleeceJacket;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")private WebElement BoltTshirt;
	@FindBy(className = "shopping_cart_link")private WebElement CartButton;
	
	//constructors
	public InventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//methods
	public void FleeceJacketAddToCartButton()
	{
		FleeceJacket.click();
	}
	public void BoltTshirtAddToCartButton()
	{
		BoltTshirt.click();
	}
	public void ClickOnCartButton()
	{
		CartButton.click(); 
	}
	
	

}
