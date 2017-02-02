package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Educational_Trade_Products extends BasePage
{

	public Educational_Trade_Products(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//Banner
	@FindBy(xpath = "//div[@class= 'products']//h2")
	private WebElement products_PageHeader;
	
	@FindBy(xpath ="//div[@class='flexslider']/ol/li[1]/a[contains(text(), 'Learners')]" )
	private WebElement products_BannerLearners;
	
	@FindBy(xpath = "//div[@class='flexslider']/ol/li[2]/a[contains(text(), 'Literacy Pro')]")
	private WebElement products_BannerLiteracyPro;
	
	
	@FindBy(xpath ="//div[@class='flexslider']/ol/li[3]/a[contains(text(), '')]" )
	private WebElement products_BannerGuidedReading;
	
	@FindBy(xpath ="//div[@class='flexslider']/ol/li[4]/a[contains(text(), '')]" )
	private WebElement products_BannerGerStilton;
	
	@FindBy(xpath ="//div[@class='flexslider']/ul/li[1]/a[contains(text(), 'Previous')]" )
	private WebElement products_BannerPrevious;
	
	@FindBy(xpath ="//div[@class='flexslider']/ul/li[2]/a[contains(text(), 'Next')]" )
	private WebElement products_BannerNext;
	
	@FindBy(xpath ="//div[@class='list-products']/h2[contains(text(), '')]" )
	private WebElement products_AllProdcuts;
	
	@FindBy(xpath = "//div[@class='form-type-select form-item-sort-by form-item form-group']/*[contains(text(),'Sort By')]")
	private WebElement products_SortBy;
	
	@FindBy(xpath = "//div[@class='form-type-select form-item-sort-by form-item form-group']/*[contains(text(),'Sort By')]")
	private WebElement products_Show;
	
	//div[@class='form-type-select form-item-sort-by form-item form-group']/select[@id='edit-sort-by']
	
	@FindBy(xpath = "//select[@id='edit-sort-by']")
	private WebElement products_SortByDropdown;
	
	//div[@class='form-type-select form-item-sort-by form-item form-group']/select[@id='edit-sort-by']
	
	@FindBy(xpath ="//select[@id='edit-tid']")
	private WebElement products_ShowDropdown;
	
	@FindBy(xpath ="//ul[@class='pager']")
	private WebElement products_pagination;
	
	//ul[@class='pager']
	
	//Need More Info block
	
	@FindBy(xpath ="//*[@id='block-views-custom-contact-form-block-6']")
	private WebElement products_Salesfooter;
	
	@FindBy(linkText= "Contact Us Online")
	private WebElement products_ContactUsOnline;
	
}
