package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.ScholasticInternational_Home;

public class MyCartDropDown extends ScholasticInternational_Home 
{

	public MyCartDropDown(WebDriver driver) 
	{
		super(driver);
		
	}

	
	//@FindBy(xpath= "//li[@class='my-cart']")
	//private WebElement mycart;
	
	@Test
	public void verifymycartdropdown()
	{
		ScholasticInternational_Home mycart = new ScholasticInternational_Home(driver);
		mycart.mycart();
		mycart.addProducts();
		//public void verifyTitle(String );
		
	}
	
}