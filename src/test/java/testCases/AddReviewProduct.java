package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class AddReviewProduct extends BaseClass{
	
	@Test
	public void addreview()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		HomePage h=new HomePage(driver);
		h.productBtn();
	ProductsPage p=new ProductsPage(driver);
	boolean status=p.productpageVisible();
	Assert.assertEquals(status, true);
	p.clickViewProduct();
boolean status1=p.reviewBoxVisible();
	Assert.assertEquals(status1, true);
	p.enterReviewName("kiran");
	p.enterReviewEmail("test@gmail.com");
	p.enterReview("amazing");
	p.submitReview();
	   WebElement ele= driver.findElement(By.xpath("//div[@class='col-md-12 form-group']//div[@class='alert-success alert']"));
	   js.executeScript("arguments[0].scrollIntoView()", ele);
	   
	   boolean msg=ele.isDisplayed();
	   Assert.assertEquals(msg, true);
	
	
	
	
	
	}

}
