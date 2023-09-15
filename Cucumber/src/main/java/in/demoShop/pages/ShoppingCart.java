package in.demoShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	

	@FindBy(linkText = "Shopping cart")
	private WebElement cart;
	
	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
	private WebElement check;
	
	@FindBy(xpath = "(//input[contains(@type,'submit')])[2]")
	private WebElement update;
	
	public ShoppingCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void viewShoppingCart()
	{
		cart.click();
	}
	
	public void clickCheckbox()
	{
		check.click();
	}
	
	public void updateCart()
	{
		update.click();
	}

}
