package testCases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import testBase.BaseClass;

public class VerifySubscribeHomepage extends BaseClass{
	
	@Test
	public void testsubMethod()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		HomePage h=new HomePage(driver);
		h.cartBtn();
		h.subEmail(randomAlphaNumeric());
		h.clickarrowBtn();
		
		
		

       WebElement ele= driver.findElement(By.xpath("//div[@class='alert-success alert']"));
	   js.executeScript("arguments[0].scrollIntoView()", ele);
		
	  boolean status= ele.isDisplayed();
	  Assert.assertEquals(status, true);
		
	
	}

}
