package pom;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public abstract class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	
	public void verifyTitle(String eTitle)
	{
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
		
		
	}
	/*public WebElement waitforelement(WebElement e){
		try {
			   (new WebDriverWait(driver, 60)).until(ExpectedConditions
			     .visibilityOf(e));
			  }

			  catch (NoSuchElementException nse) {
			   //this.reportLog(this.getClass().getName() + "/" + nse.getMessage());
			   
			  } catch (TimeoutException toe) {
			   Throwable tr = toe;
			   // get the root cause
			   while (tr.getCause() != null) {
			    tr = tr.getCause();
			   }
			   String expString = tr.getMessage();
			   expString = expString
			     .replace(
			       "(WARNING: The server did not provide any stacktrace information)",
			       "");
			   //this.reportLog(this.getClass().getName() + "/" + expString);
			   //assertTrue(this.getClass().getName() + "/" + expString, false);
			  }
			  return e;
	}*/
	

}
