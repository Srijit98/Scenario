package in.demoShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
	
	@FindBy(linkText = "Books")
	private WebElement book;
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickBooks()
	{
		book.click();
	}
	



}
