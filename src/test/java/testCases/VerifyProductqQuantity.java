package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class VerifyProductqQuantity extends BaseClass{
	
	@Test
	public void verifyQuantity()
	{
		HomePage h=new HomePage(driver);
		System.out.println(h.homeVisible());
		h.productBtn();
		
		ProductsPage p=new ProductsPage(driver);
		boolean status=p.productpageVisible();
		Assert.assertEquals(status, true);
		p.clickViewProduct();
		
	boolean productName=p.verifyproductName();
	Assert.assertEquals(productName, true);
	
	p.addQuantity("5");
	p.addToCart();
	p.viewCartFunc();
	
   String quantity=p.verifyProductQuantity();
   int quant=Integer.parseInt(quantity);
   if(quant==5)
   {
	   Assert.assertTrue(true);
   }
   else
   {
	   Assert.assertTrue(false);
   }

		
		
	}

}
