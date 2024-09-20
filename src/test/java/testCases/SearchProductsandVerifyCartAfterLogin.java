package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class SearchProductsandVerifyCartAfterLogin extends BaseClass {
	
	@Test
	void verifysearch()
	{
		HomePage h=new HomePage(driver);
		h.productBtn();
		ProductsPage p=new ProductsPage(driver);
		p.searchProducts("Tshirts");
		p.clickSearchBtn();
		List<WebElement > items=driver.findElements(By.xpath("//div[@class='features_items']/child::div[@class='col-sm-4']"));
		List<WebElement > items1=driver.findElements(By.xpath("//a[@class='btn btn-default add-to-cart']"));
		System.out.println(items.size());
		
		
			
	}

}
