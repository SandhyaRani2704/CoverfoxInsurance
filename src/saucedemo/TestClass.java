package saucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		
		LoginPage login=new LoginPage(driver);
		login.enterUserName();
		login.enterPassword();
		login.ClickOnLoginButton();
		
		InventoryPage inventory=new InventoryPage(driver);
		inventory.FleeceJacketAddToCartButton();
		inventory.BoltTshirtAddToCartButton();
		inventory.ClickOnCartButton();
		
		CartPage cart=new CartPage(driver);
		cart.ClickOnCheckout();

	}

}
