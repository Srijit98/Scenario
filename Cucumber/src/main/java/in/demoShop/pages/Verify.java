package in.demoShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify {
	
	@FindBy(xpath = "//div[contains(@class,'order-summary-content')]")
	private WebElement message;
	
	public Verify(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyMessage()
	{
		String text = message.getText();
		return text;
	}


}
