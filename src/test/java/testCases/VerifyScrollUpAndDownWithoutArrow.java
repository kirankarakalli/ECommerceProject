package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.JavascriptExecutor;
import pageObjects.HomePage;
import testBase.BaseClass;

public class VerifyScrollUpAndDownWithoutArrow extends BaseClass{
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
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(h.homeVisible());
	}

}
