package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScholasticInternational_Home extends BasePage
	{	
	public ScholasticInternational_Home(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath ="//a[@class='logo']")
	private WebElement homeLogo;
	
	@FindBy(id= "edit-search-text")
	private WebElement searchInputBox;
	
	@FindBy(id= "edit-submit")
	private WebElement searchButton;
	
	@FindBy(xpath= "//li[@class='my-account not-login-account']")
	private WebElement signin;
	
	@FindBy(xpath= "//li[@class='my-cart']")
	private WebElement mycart;
	
	@FindBy(xpath= "(//a[contains(text(), 'Contact Us')])[1]")
	private WebElement contactUs_Main_Menu;
	
	//	@FindBy(linkText= "Contact Us")
	//	private WebElement ContactUs_Main_Menu;
	
	@FindBy(xpath= "//button[@type='button']")
	private WebElement hamburger_Menu;
	
	@FindBy (id= "//a[@id='main-menu']")
	private WebElement hamburger_Menu_HomeButton;
	
	@FindBy(id="product_main_menu")
	private WebElement hbm_Products;
	
	@FindBy(xpath= "//div[@id='block-block-4']/div[1]/h3")
	private WebElement hbm_Education;
	
	@FindBy(xpath= "//div[@id='block-block-4']/div[2]/h3")
	private WebElement hbm_Trade;
	
	@FindBy(linkText= "View All Products")
	private WebElement hbm_View_All_Products_button;
	
	@FindBy(xpath= "(//img[@alt='Literacy Solutions'])[1]")
	private WebElement hbm_Literacy_Solutions;
	
	@FindBy(xpath= "//div[@class='views-row views-row-2 views-row-even views-row-last']/div[1]")
	private WebElement hbm_Prime_Mathematics;
	
	@FindBy(id="catalogs-view-block")
	private WebElement hbm_Catalogs;
	
	@FindBy(xpath= "//li[@class='primary_3 active']/div/div[1]")
	private WebElement hbm_Catalogs_plank;
	
	@FindBy(linkText= "View All Catalogs")
	private WebElement hmb_View_All_Catalogs_button;
	
	
	@FindBy(id="block-views-product-list-block-1")
	private WebElement Featured_Products_Catalogs;
	
	@FindBy(xpath= "//a[contains(@class, 'anc_btn_red')]")
	private WebElement view_All_Products_button;
	
	@FindBy(xpath= "//a[contains(@class, 'anc_btn_red')]")
	private WebElement view_All_Catalogs_button;
	
	@FindBy(xpath= "//section[@id='block-views-landing-page-block']/h2")
	private WebElement ListBuilderHeader;
	
	@FindBy(xpath= "//section[@id='block-views-landing-page-block']/div")
	private WebElement ListBuilderSearchBox;
	
	//ListBuilder Searchbox and button
	@FindBy(xpath= "//input[@class='search_term'] ")
	private WebElement ListBuilderInputBox;
	
	@FindBy(id="list_builder")
	private WebElement ListBuilderSearchButton;
	
	@FindBy(xpath= "//tr[@class='row-1 row-first row-last']")
	private WebElement ListBuilderSRBookList; //SRBookList= Scholastic recommended book lists
	
	@FindBy(xpath= "//section[@id='block-views-news-block-1']/h2")
	private WebElement NewsEventsHeader; //
	
	@FindBy(xpath= "//section[@class='col-sm-12']")
	private WebElement NewsEventsBlock; 
	
	@FindBy(linkText= "View All News & Events ")
	private WebElement ViewAllNewsEvents; 
	
	@FindBy(linkText= "//div[@class='view-header']/h2")
	private WebElement NeedMoreInfor; 
	
	@FindBy(linkText= "Contact Us Online")
	private WebElement NMI_ContactUsOnlineButton; 
	
	//Subscribe
	@FindBy(xpath= "//section [@id='block-simplenews-5172']/h2")
	private WebElement SubscribeNewsletterHeader; 
	
	@FindBy(id="edit-mail")
	private WebElement emailInputBox;
	
	@FindBy(id="newsletter_subscribe_footer")
	private WebElement SubscribeButton;
	
	
	//Methods to verify the elements
		
	public void HomeLogo()
	{
		hamburger_Menu_HomeButton.isDisplayed();
	}
	
	public void siteSearch()	
	{
		searchInputBox.sendKeys("Harry");
		searchButton.click();
	}
		
	
	
	public void ContactUS()
	{
		contactUs_Main_Menu.click();
	}
	
	


}
