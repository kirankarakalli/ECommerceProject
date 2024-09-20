package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import testBase.BaseClass;

public class ViewCategoryProducts extends BaseClass{
	
	@Test
	public void verifyCategory()
	{
		HomePage h=new HomePage(driver);
		boolean category=h.categoryIsDisplayed();
		Assert.assertEquals(category, true);
		h.woMenBtn();
		h.womenDress();
		
		Assert.assertEquals(h.verifyCategoryIsDisplayed(), "WOMEN - DRESS PRODUCTS");
		
		h.menBtn();
		h.menDress();
		Assert.assertEquals(h.verifyCategoryIsDisplayed(), "MEN - TSHIRTS PRODUCTS");
	}

}
