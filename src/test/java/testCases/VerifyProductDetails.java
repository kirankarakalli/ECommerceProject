package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class VerifyProductDetails extends BaseClass {
   
	
	@Test
	public void verifyProductMethod()
	{
		HomePage h=new HomePage(driver);
		h.productBtn();
		
		ProductsPage p=new ProductsPage(driver);
		Assert.assertEquals(p.productpageVisible(), true);
		p.clickViewProduct();
		Assert.assertEquals(p.verifyproductName(), true);
		System.out.println(p.verifycategoryName());
		Assert.assertEquals(p.verifyPrice(), true);
		Assert.assertEquals(p.verifyavail(), true);
		Assert.assertEquals(p.verifycondition(), true);
		Assert.assertEquals(p.verifybrand(), true);
		
	}
	
	

}
