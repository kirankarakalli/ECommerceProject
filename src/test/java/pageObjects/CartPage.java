package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage  extends BasePage{

   public CartPage(WebDriver driver) {
		super(driver);
		
	}
   

   
   @FindBy(xpath="//li[@class='active']")WebElement shoppingCartPage;
   @FindBy(xpath="//a[@class='btn btn-default check_out']") WebElement checkOut;
   @FindBy(xpath="//u[normalize-space()='Register / Login']") WebElement registerLogin;
   @FindBy(xpath="//textarea[@class='form-control']")WebElement enterMsg;
   @FindBy(xpath="//a[@class='btn btn-default check_out']")WebElement placeOrder;
  @FindBy(xpath="//a[@class='cart_quantity_delete']")WebElement delete;
  @FindBy(xpath="/html/body/section/div/div[2]/span/p/b") WebElement cartIsEmpty;
  
//tr[@id='product-1']//i[@class='fa fa-times']
   
  public boolean cartEmptyIsDisplayed()
  {
	  return checkOut.isDisplayed();
  }
  
   public void deleteProductFromCart()
   {
	   delete.click();
	   
   }
   
   public boolean verifyShoppingCartPage()
   {
	   return shoppingCartPage.isDisplayed();
			   
   }
   
   public void checkOutBtn()
   {
	   checkOut.click();
   }
   
   public void registerLoginBtn()
   {
	   registerLogin.click();
   }
   
   public void enterMsgForm(String msg)
   {
	   enterMsg.sendKeys(msg);
   }

   public void placeOrder()
   {
	   placeOrder.click();
   }
 

}
