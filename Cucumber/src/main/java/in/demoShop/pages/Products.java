package in.demoShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
	

	
	@FindBy(xpath = "(//input[contains(@class,'button-2')])[1]")
	private WebElement prod1;
	
	@FindBy(xpath = "(//input[contains(@class,'button-2')])[2]")
	private WebElement prod2;
	
	@FindBy(xpath = "(//input[contains(@class,'button-2')])[3]")
	private WebElement prod3;
	
	public Products(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickFirstProduct()
	{
		prod1.click();
	}
	
	
	public void clickSecondProduct()
	{
		prod2.click();
	}
	
	public void clickThirdProduct()
	{
		prod3.click();
	}

}
