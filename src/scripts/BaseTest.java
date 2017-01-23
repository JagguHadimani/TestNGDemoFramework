package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest implements AutomationConstants {
	public WebDriver driver;
	
	@BeforeTest
	public void preCondotion()
	{
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://emea.scholastic.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		
	}
	
	@AfterTest
	public void postCondition()
	{
		driver.close();
	}
	
	

}
