package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.ContactPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class ContactUSTestCase extends BaseClass{
	
	
	@Test
	void contactUsTest()
	{
		HomePage h=new HomePage(driver);
		System.out.println(h.homeVisible());
		h.contactUsBtn();
		
		ContactPage cp=new ContactPage(driver);
		Assert.assertEquals(cp.verifyContactPage(), true);
		
		cp.cName(generatestring());
		cp.cEmail(randomAlphaNumeric());
		cp.cSubject("selenium");
		cp.cForm(generatestring());
	     
		cp.cUploadFile("C:\\Users\\EI13593\\OneDrive - Tietoevry\\Test Plan.jmx");
		cp.submit();
		
		 driver.switchTo().alert().accept();
		 Assert.assertEquals(cp.success(), "Success! Your details have been submitted successfully.");
		 
		 cp.clickHome();
		
		 Assert.assertEquals(cp.verifyhome(), "Automation");
		
		
	}
	

}

