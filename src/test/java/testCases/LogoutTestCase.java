package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import testBase.BaseClass;

public class LogoutTestCase extends BaseClass {
	
	@Test
	public void logoutMethod()
	{
		HomePage h=new HomePage(driver);
	    System.out.println(h.homeVisible());
	    h.signupLoginBtn();
	    
	    LoginPage l=new LoginPage(driver);
	   
	   l.loginEmailFunc("kirankarakalli92@gmail.com");
	   l.loginPasswordFunc("Kirank@123");
	   l.loginBtnFunc();
	   
	   LogoutPage lp=new LogoutPage(driver);
	   lp.clickLogout();
	   System.out.println(lp.logoutBrnVerify());
	   
	}

}
