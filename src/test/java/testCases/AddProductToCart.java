package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class AddProductToCart extends BaseClass{
	
	@Test
	public void addToCartTestMethod()
	{
		HomePage h=new HomePage(driver);
		h.productBtn();
		
		ProductsPage p=new ProductsPage(driver);
		p.hoverOnFirstProduct();
		p.addToCartFirstFunc();
		p.continueShop();
		p.addToCartSecondFunc();
		p.viewCartFunc();
	   
		
		
		
	}

}
