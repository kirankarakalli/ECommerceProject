package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.TestCasePage;
import testBase.BaseClass;

public class TestCasesPageTest extends BaseClass{

	@Test
	public void testCaseMethod()
	{
		HomePage h=new HomePage(driver);
		h.testCaseButton();
		
	    TestCasePage t=new TestCasePage(driver);
	    System.out.println(t.validTestCasePage());
	   
	}
	
	
}
