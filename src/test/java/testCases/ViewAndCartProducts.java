package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import testBase.BaseClass;

public class ViewAndCartProducts extends BaseClass{
	@Test
	public void ViewAndcartProduct()
	{
		HomePage h=new HomePage(driver);
		h.productBtn();
		boolean brand=h.verifyBrandText();
		Assert.assertEquals(brand, true);
		h.poloBrand();
		Assert.assertEquals(h.verifyCategoryIsDisplayed(),"BRAND - POLO PRODUCTS");
		h.HMBrand();
		Assert.assertEquals(h.verifyCategoryIsDisplayed(), "BRAND - H&M PRODUCTS");
		
	}
	

}
