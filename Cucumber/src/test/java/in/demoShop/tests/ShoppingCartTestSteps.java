package in.demoShop.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import in.demoShop.pages.*;

public class ShoppingCartTestSteps {
	
	WebDriver driver;
	
	@Given("A user is on the landing page of demowebshop")
	public void a_user_is_on_the_landing_page_of_demowebshop() {
	   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("he clicks on books")
	public void he_clicks_on_books() {
	    
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickBooks();
	}

	
	@When("he adds the first product")
	public void he_adds_the_first_product() {
	    
		Products products = new Products(driver);
		products.clickFirstProduct();
	}

	@When("he adds the second product")
	public void he_adds_the_second_product() {
	    
		Products products = new Products(driver);
		products.clickSecondProduct();
	}

	@When("he adds the third product")
	public void he_adds_the_third_product() {
	    
		Products products = new Products(driver);
		products.clickThirdProduct();
	}

	@When("he removes one of the products")
	public void he_removes_one_of_the_products() {
	    
		ShoppingCart shoppingCart = new ShoppingCart(driver);
		     shoppingCart.viewShoppingCart();
		     shoppingCart.clickCheckbox();
		     shoppingCart.updateCart();
	}

	@Then("he verifies the shopping cart.")
	public void he_verifies_the_shopping_cart() {
		
		Verify verify = new Verify(driver);
		String expectedText = "Your Shopping Cart is empty!";
		String actualText = verify.verifyMessage();
		Assert.assertEquals(actualText, expectedText);
		driver.quit();

	    
	}

}
