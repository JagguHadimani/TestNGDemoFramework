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
	private WebElement hamburger_Menu_Button;
	
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
	private WebElement EmailInputBox;
	
	@FindBy(id="newsletter_subscribe_footer")
	private WebElement SubscribeButton;
	
	//Signin Pop Up
	@FindBy(xpath = "//div[@class='popups-container']")
	private WebElement SigninPopup;
	
	@FindBy(id="edit-name")
	private WebElement UIDEmail;
	
	@FindBy(id="edit-pass")
	private WebElement Password;
	
	@FindBy(id="scholastic_user_login_popup")
	private WebElement LoginButton;
	
	@FindBy(linkText= "Register Now")
	private WebElement RegisterButton;
	
	@FindBy(xpath="//span[contains(text(), 'Close')]")
	private WebElement PopupClose;
	
	@FindBy(linkText = "view cart")
	private WebElement viewCartButton;
	
	@FindBy(linkText = "Add Products")
	private WebElement AddProducts;
	
	@FindBy(xpath="//li[@class= 'my-account login-account']")
	private WebElement myAccount;
	
	
	@FindBy(linkText = "My Profile")
	private WebElement myProfile;
	
	@FindBy(linkText = "My Lists")
	private WebElement mylists;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	//View Cart dropdown related
	
	//view cart
	@FindBy(linkText = "view cart")
	private WebElement viewCart;
	
	//checkout
	@FindBy(linkText = "checkout")
	private WebElement checkout;
	
	//Methods to verify the elements
		
	public void verifyHomeLogo()
	{
		homeLogo.isDisplayed();
	}
	
	public void verifyHamburgermenu()
	/*there are multiple tabs which link to respective page. Verify all the tabs redirect to the 
	respective pages using page titles 
	
	HamMenu is expanded when it is only on home page, menu is contacted when user is on any page other than home page*/
	{
		/*//can I verify all the elements of a section in one method by may putting them in a collection say list or set?
		hamburger_Menu.isDisplayed();
		hamburger_Menu_HomeButton.isDisplayed();
		hbm_Products.isDisplayed();
		hbm_Catalogs.isDisplayed();*/
		if(	hamburger_Menu_HomeButton.isDisplayed())
		{
			hamburger_Menu_HomeButton.click();
			
		}
		else 
		{
			hamburger_Menu_Button.click();
			hamburger_Menu_HomeButton.click();
			
			verifyTitle("Scholastic: Children Book Publishing | Scholastic International");
			
		}
	}
	
	public void verifySearchFunctionality()
	{
		if(searchInputBox.isDisplayed())
		searchInputBox.sendKeys("Prime maths");
		searchButton.click();
		
				
	}
	
	public void signIn()
	{
		//Click on Sign in 
		signin.click();
		//Enter User name and pwd
		UIDEmail.sendKeys("jagadish.hadimani@relevancelab.com");
		Password.sendKeys("Welcome!123");
		//Click on Login button
		LoginButton.click();
		//verify if the user is logged in
		
	}
	
	
	
	public void register()
	{
		
	}
	
	public void closeSignInPopUp()
	{
		PopupClose.click();
	}
	
	
	public void signOut()
	{}
	
	
	public void mycart()
	{
		mycart.click();
		
	}
	
	public void viewCartButton()
	{
		if(viewCartButton.isDisplayed())
		
		{
			viewCartButton.click();
		}
		else {			
				}
	}
		
		
		public void addProducts()
		{
			if(AddProducts.isDisplayed())
			
			{
				AddProducts.click();
			}
			else {
				
					}
			
			
	}
	

}
