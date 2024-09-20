package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath="//h2[@class='title text-center']")WebElement productPageVisible;
	@FindBy(linkText="View Product")WebElement viewProduct ;
	@FindBy(xpath="	//div[@class='product-information']//h2")WebElement productName;
	@FindBy(xpath="//div[@class='product-information']//p[1]")WebElement category;
	@FindBy(xpath="//span[normalize-space()='Rs. 500']")WebElement price;
	@FindBy(xpath="//div[@class='product-details']//p[2]")WebElement avail;
	@FindBy(xpath="	//body//section//p[3]")WebElement condition;
	@FindBy(xpath="//body//section//p[4]")WebElement brand;
	@FindBy(xpath="//*[@class='single-products']//p") List<WebElement> items;
	 @FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/h2") WebElement searchProducts;
    @FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/input[1]")WebElement enterItem;
    @FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/button[1]")WebElement searchBtn;
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]")WebElement firstProduct;
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]")WebElement secondProduct;
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a") WebElement addToCartFirst;
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a") WebElement addToCartSecond;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']") WebElement continueShopping;
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a") WebElement viewCart;
	
	
	//TestCase 13 xpaths
	
	@FindBy(xpath="//input[@id='quantity']") WebElement quantity;
	@FindBy(xpath="//button[@class='btn btn-default cart']") WebElement addToCartBtn;
	@FindBy(xpath="//button[@class='disabled']") WebElement productQuantityInCartPage;
	

	
	
	
	
	
	
	@FindBy(xpath="//a[normalize-space()='Write Your Review']")WebElement reviewVisible;
	@FindBy(xpath="//input[@id='name']")WebElement reviewname;
	@FindBy(xpath="//input[@id='email']")WebElement reviewEmail;
	@FindBy(xpath="//textarea[@id='review']")WebElement review;
	@FindBy(xpath="//button[@class='btn btn-default pull-right']")WebElement submitreview;
	@FindBy(xpath="//*[@id=\"review-section\"]/div/div/span")WebElement thankMsg;
	
	public boolean reviewBoxVisible()
	{
		return reviewVisible.isDisplayed();
	}
	
	public void enterReviewName(String name)
	{
		reviewname.sendKeys(name);
	}
	
	public void enterReviewEmail(String email)
	{
		reviewEmail.sendKeys(email);
	}
	
	public void enterReview(String rev)
	{
		review.sendKeys(rev);
	}
	
	public void submitReview()
	{
		submitreview.click();
	}
	public void addQuantity(String i)
	{
		quantity.clear();
		quantity.sendKeys(i);
	}
	
	public void addToCart()
	{
		addToCartBtn.click();
	}
	
	public String verifyProductQuantity()
	{
		return productQuantityInCartPage.getText();
	}
	public void addToCartFirstFunc()
	{
		 addToCartFirst.click();;
	}
	
	public void addToCartSecondFunc()
	{
		 addToCartSecond.click();;
	}
	
	public void continueShop()
	{
		continueShopping.click();
	}

	public void viewCartFunc()
	{
		viewCart.click();
	}
	
	
	public void hoverOnFirstProduct()
	{
		Actions act=new Actions(driver);
		act.moveToElement(firstProduct).build().perform();
	}
	

	public void hoverOnSecondProduct()
	{
		Actions act=new Actions(driver);
		act.moveToElement(secondProduct).build().perform();
	}
	public void searchProducts(String product)
	{
		enterItem.sendKeys(product);
	}
	
	public void clickSearchBtn()
	{
		searchBtn.click();
	}
	
	public boolean verifySearchProducts() {
		return searchProducts.isDisplayed();
	}
	
    public List<WebElement> itemsList()
    {
    	return items;
    }
	
	public boolean productpageVisible()
	{
		return productPageVisible.isDisplayed();
		
	}
	
	public void clickViewProduct()
	{
		viewProduct.click();
	}
	
	public boolean verifyproductName()
	{
		return productName.isDisplayed();
	}
	
	public String verifycategoryName()
	{
		return category.getText();
	}
	
	
	public boolean verifyPrice()
	{
		return price.isDisplayed();
	}
	
	public boolean verifyavail()
	{
		return avail.isDisplayed();
	}
	
	public boolean verifycondition()
	{
		return condition.isDisplayed();
	}
	
	public boolean verifybrand()
	{
		return brand.isDisplayed();
	}
}
