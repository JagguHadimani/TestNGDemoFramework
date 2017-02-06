package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Educational_Catalogs_Trade_Catalogs extends BasePage 
{

	public Educational_Catalogs_Trade_Catalogs(WebDriver driver) 
	{
		super(driver);
			
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[contains(text(), 'Catalogs')]")
	private WebElement Catalogs_Header;
	
	@FindBy(xpath = "//a[@class = 'gridview active']")
	private WebElement Catalogs_GridView;
	
	@FindBy(xpath = "//a[@class = 'listview']")
	private WebElement Catalogs_ListView;
	
	@FindBy(xpath = "//ul[@class='test-list-class']/*")
	private WebElement ProductListHolder;
	
	//verify if all the products are listed; for now 12 products on page 1 
	
	
	public void verifyProductsHolder()
	{
		int count = 12;
		int actualcount = driver.findElements(By.xpath("//ul[@class='test-list-class']/*")).size();
		if(count==actualcount)
		{
			System.out.println("all the products are displayed");
			
		}
	
	}
	
	
	
}
