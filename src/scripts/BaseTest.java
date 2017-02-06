package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.ScholasticInternational_Home;

public class BaseTest implements AutomationConstants 
{
	public WebDriver driver;
	
	@BeforeTest
	public void preCondotion()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		driver = new ChromeDriver();
	// driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://emea.scholastic.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
	}

	/*@Test
	public void verifySearchFunctionality()
	{
		ScholasticInternational_Home sitesearch = new ScholasticInternational_Home(driver);
		sitesearch.verifySearchFunctionality();
	}
	*/
	@AfterTest
	public void postCondition()
	{
		driver.close();
	}
}
