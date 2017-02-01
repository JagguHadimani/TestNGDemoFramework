package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.ScholasticInternational_Home;

public class SiteSearch extends ScholasticInternational_Home
{

	public SiteSearch(WebDriver driver) 
	{
		super(driver);

	}
/*
	@Test
	public void verifySearchFunctionality()
	{
		ScholasticInternational_Home sitesearch = new ScholasticInternational_Home(driver);
		sitesearch.verifySearchFunctionality();
	}*/
}
