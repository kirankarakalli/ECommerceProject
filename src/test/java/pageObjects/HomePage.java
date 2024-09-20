package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	

	
	@FindBy(xpath="//a[normalize-space()='Home']") WebElement home;
	@FindBy(xpath="//a[@href='/products']") WebElement products;
	@FindBy(xpath="//a[normalize-space()='Cart']") WebElement cart;
	@FindBy(xpath="//a[normalize-space()='Signup / Login']") WebElement signuplogin;
	@FindBy(xpath="//a[normalize-space()='Video Tutorials']") WebElement video;
	@FindBy(xpath="//a[normalize-space()='Contact us']") WebElement contactus;
	@FindBy(xpath="//div[@class='item active']//span[1]") WebElement homepagevisible;
	
	@FindBy(xpath= "\r\n"+ "//a[normalize-space()='Test Cases']") WebElement testCaseBtn;
	
	@FindBy(xpath="//h2[normalize-space()='Subscription']")WebElement subscribe;
	@FindBy(xpath="//input[@id='susbscribe_email']")WebElement subscribeemail;
	@FindBy(xpath="//button[@class='btn btn-default']")WebElement arrowBtn;
	@FindBy(xpath="//h2[normalize-space()='Category']")WebElement category;
	@FindBy(xpath="//a[normalize-space()='Women']")WebElement woMen;
	@FindBy(xpath="//a[normalize-space()='Men']")WebElement men;
	@FindBy(xpath="//div[@class='panel-collapse in']//a[contains(text(),'Dress')]")WebElement dress;
	@FindBy(xpath="//a[normalize-space()='Tshirts']")WebElement tShirts;
	@FindBy(xpath="//h2[@class='title text-center']")WebElement verifyCategory;
	
	@FindBy(xpath="//h2[normalize-space()='Brands']") WebElement brand;
	@FindBy(xpath="//a[@href='/brand_products/Polo']")WebElement polo;
	@FindBy(xpath="//a[@href='/brand_products/H&M']")WebElement HM;
	
	@FindBy(xpath="//h2[normalize-space()='recommended items']") WebElement recommended;
	@FindBy(xpath="//div[@class='item active']//div[1]//div[1]//div[1]//div[1]//a[1]")WebElement addToCart;
	@FindBy(xpath="//u[normalize-space()='View Cart']")WebElement viewCart;
	@FindBy(xpath="//a[normalize-space()='Stylish Dress']")WebElement bluetop;
	
	@FindBy(xpath="//a[normalize-space()='Logout']") WebElement logout;
	
	public void logoutpage()
	{
		logout.click();
	}
	public boolean recommendedVisible()
	{
		return recommended.isDisplayed();
	}
	
	public void addToCartBtn()
	{
		addToCart.click();
	}
	
	public void viewcartBtn()
	{
		viewCart.click();
	}
	
	
	public boolean cartProductVisible()
	{
		return bluetop.isDisplayed();
	}
	
	
	
	
	
	public boolean verifyBrandText()
	{
		return brand.isDisplayed();
	}
	
	public void poloBrand()
	{
		polo.click();
	}
	
	public void HMBrand()
	{
		HM.click();
	}
	
	
	public boolean categoryIsDisplayed()
	{
		return category.isDisplayed();
	}

	public void woMenBtn()
	{
		woMen.click();
	}
	
	public void menBtn()
	{
		men.click();
	}
	
	public void womenDress()
	{
		dress.click();
	}
	
	public void menDress()
	{
		tShirts.click();
	}
	
	public String verifyCategoryIsDisplayed()
	{
		return verifyCategory.getText();
	}
	
	public void homeBtn()
	{
		home.click();
	}
	public void productBtn()
	{
		products.click();
	}
	
	
	public void cartBtn()
	{
		cart.click();
	}
	
	public void signupLoginBtn()
	{
		signuplogin.click();
	}
	
	public void videoBtn()
	{
		video.click();
	}
	
	public void contactUsBtn()
	{
		contactus.click();
	}
	
	
	public String homeVisible()
	{
		try {
			return homepagevisible.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public void testCaseButton()
	{
		testCaseBtn.click();
	}
	
	
	
	public boolean verifysubscribeText()
	{
		return subscribe.isDisplayed();
	}
	
	public void subEmail(String email)
	{
		subscribeemail.sendKeys(email);
	}
	
	public void clickarrowBtn()
	{
		arrowBtn.click();
	}
	

}
