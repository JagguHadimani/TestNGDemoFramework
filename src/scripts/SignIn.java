package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.ScholasticInternational_Home;

public class SignIn extends BaseTest
{

	public SignIn(WebDriver driver) 
	{
		super();
		
	}
	
	@Test
	public void signIn()
	{
		ScholasticInternational_Home signin = new ScholasticInternational_Home(driver);
		signin.signIn();
	}

	
	
}