package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.RegistrationUser;
import testBase.BaseClass;

public class RegistarionTestCase extends BaseClass {
	


	
	
	@Test
	public void register()
	{
		logger.info("registratin started");
		HomePage h=new HomePage(driver);
		System.out.println(h.homeVisible());
		h.signupLoginBtn();
		
		RegistrationUser reg=new RegistrationUser(driver);
		System.out.println(reg.signuptextvisible());
		logger.info("entering the details of user");
		reg.username(generatestring().toUpperCase());
		reg.useremail(generatestring()+"@gmail.com");
		reg.signup();
		String status=reg.verifyaccountinfovisible();
		System.out.println(status);
		if(status=="Email Address already exist!")
		{
			Assert.fail();
		}
		reg.mrcheckbox();
		String password=randomAlphaNumeric();
		reg.Password(password);
		reg.day("1");
		reg.month("2");
		reg.year("2001");
		reg.newsCheck();
		reg.offerCheck();
		reg.firstname(generatestring().toUpperCase());
		reg.lastname(generatestring().toUpperCase());
	    reg.Company("Tieto");
		reg.Address(generatestring());
		reg.Country("Israel");
		reg.State("Karnataka");
		reg.City("Mysore");
		reg.Zipcode("586214");
		reg.phone(generatenumber());
		reg.clickaccountcreate();
	     System.out.println(reg.accountCreated());
		reg.Continuebtn();
		reg.loginasname();
		reg.deleteAccount();
	     System.out.println(reg.accountDeleted());
		reg.Continuebtn();
		
		logger.info("test case ended");
	}

	
	
	

}
