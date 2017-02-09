package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.ScholasticInternational_Home;

public class VerifyHamburgerMenu extends BaseTest
{
	//ScholasticInternational_Home

	//VerifyHamburgerMenu home = new VerifyHamburgerMenu(driver);

	@Test
	public void verifyHamMenu_HomeButton()
	
	{
	ScholasticInternational_Home home = new ScholasticInternational_Home(driver);
	home.verifyHomeLogo();
			
	}
	
	@Test
	public void verifyHamberger_Home()
	{
		ScholasticInternational_Home home1 = new ScholasticInternational_Home(driver);
	}
	
	//7353076739

}
