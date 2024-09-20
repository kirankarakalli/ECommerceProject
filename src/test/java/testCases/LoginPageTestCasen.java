package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationUser;
import testBase.BaseClass;
import utilities.DataProviders;

public class LoginPageTestCasen extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void loginMethod(String email,String password,String exp)
	{
		logger.info("test started");
		try {
		HomePage h=new HomePage(driver);
	    System.out.println(h.homeVisible());
	    h.signupLoginBtn();
	    
	    LoginPage l=new LoginPage(driver);
	   System.out.println( l.verifyLoginFun());
	   l.loginEmailFunc(email);
	   l.loginPasswordFunc(password);
	   l.loginBtnFunc();
	   
      
	   
	  
	 /*  RegistrationUser r=new RegistrationUser(driver);
	   System.out.println(r.loginasname());
	   r.deleteAccount();
	   
	   System.out.println(r.accountDeleted());
	   
	   */
		}
		catch(Exception e)
		{
			 LoginPage l=new LoginPage(driver);
			   String invalidUser=l.verifyDetails();
			   Assert.assertEquals(invalidUser,"Your email or password is incorrect!");
			   Assert.fail();
		}
		
		logger.info("test ended");
	}
	
	
	

}
