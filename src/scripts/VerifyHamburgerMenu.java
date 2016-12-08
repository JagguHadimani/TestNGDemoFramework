package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.ScholasticInternational_Home;

public class VerifyHamburgerMenu extends ScholasticInternational_Home
{
	public VerifyHamburgerMenu(WebDriver driver) {
		super(driver);
		
	}

	@Test
	public void verifyHamMenu()
	
	{
		ScholasticInternational_Home home = new ScholasticInternational_Home(driver);
		home.verifyHomeLogo();
		
	
	}
	

}
