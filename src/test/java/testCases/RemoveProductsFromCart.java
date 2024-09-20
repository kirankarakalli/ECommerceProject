package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class RemoveProductsFromCart extends BaseClass{
	
	@Test
	public void removeMethod()
	{
	HomePage h=new HomePage(driver);
	 h.productBtn();
	 ProductsPage p=new ProductsPage(driver);
		p.hoverOnFirstProduct();
		p.addToCartFirstFunc();
		p.continueShop();
		p.hoverOnSecondProduct();
		p.addToCartSecondFunc();
		p.continueShop();
		
		h.cartBtn();
		CartPage c=new CartPage(driver);
		Assert.assertEquals(c.verifyShoppingCartPage(), true);
		c.deleteProductFromCart();
		boolean status=c.cartEmptyIsDisplayed();
	     Assert.assertEquals(status, true);
	}
}
