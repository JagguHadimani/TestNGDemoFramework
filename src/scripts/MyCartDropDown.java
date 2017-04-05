package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.ScholasticInternational_Home;

public class MyCartDropDown extends BaseTest	//ScholasticInternational_Home 
{

	/*public MyCartDropDown(WebDriver driver) 
	{
		super(driver);
		}*/
		
	

	
	//@FindBy(xpath= "//li[@class='my-cart']")
	//private WebElement mycart;
	
	@Test
	public void verifymycartdropdown()
	{
		ScholasticInternational_Home mycart = new ScholasticInternational_Home(driver);
		System.out.println(driver);
		mycart.mycart();
		//mycart.addProducts();
		//public void verifyTitle(String );
		
	}
	
}
