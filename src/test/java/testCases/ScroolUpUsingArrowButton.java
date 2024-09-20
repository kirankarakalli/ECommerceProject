package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import testBase.BaseClass;

public class ScroolUpUsingArrowButton extends BaseClass{
	@Test
	public void scrollup() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		System.out.println(h.homeVisible());
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		boolean status=h.verifysubscribeText();
		Assert.assertEquals(status, true);
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='item active']//h1[1]"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(h.homeVisible());
	}


}
