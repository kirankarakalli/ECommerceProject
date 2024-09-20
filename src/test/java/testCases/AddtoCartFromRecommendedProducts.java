package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.JavascriptExecutor;
import pageObjects.HomePage;
import testBase.BaseClass;

public class AddtoCartFromRecommendedProducts extends BaseClass{
	
	@Test
	public void addToCart()
	{
		HomePage h=new HomePage(driver);
		h.homeBtn();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		boolean status=h.recommendedVisible();
		Assert.assertEquals(status, true);
	   h.addToCartBtn();
	   h.viewcartBtn();
	  boolean status1= h.cartProductVisible();
	  Assert.assertEquals(status1, true);
	}

}
