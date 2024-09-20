package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class SearchProduct extends BaseClass{
	
	@Test
	public void searchMethod()
	{
		HomePage h=new HomePage(driver);
		h.productBtn();
		
		ProductsPage p=new ProductsPage(driver);
       boolean statusProduct= p.productpageVisible();
       Assert.assertEquals(statusProduct, true);
		p.searchProducts("Tshirts");
		p.clickSearchBtn();
		boolean statusSearchPage=	p.verifySearchProducts();
		Assert.assertEquals(statusSearchPage, true);
		
		List<WebElement> items=p.itemsList();
		boolean searchproductstatus=false;
		for(WebElement ele:items)
		{
				if(ele.getText().contains("T-Shirt"))
				{
					searchproductstatus=true;
					break;
				}
			
		}
		
		
	
		Assert.assertEquals(searchproductstatus, true);
		
		
		
	
	}

}
