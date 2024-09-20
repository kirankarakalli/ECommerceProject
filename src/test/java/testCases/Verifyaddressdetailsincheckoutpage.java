package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AddressDetails;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductsPage;
import pageObjects.RegistrationUser;
import testBase.BaseClass;

public class Verifyaddressdetailsincheckoutpage extends BaseClass {
	
	@Test
	public void verifyaddress()
	{
		HomePage h=new HomePage(driver);
		System.out.println(h.homeVisible());
		h.signupLoginBtn();
RegistrationUser reg=new RegistrationUser(driver);
		
		
		System.out.println(reg.signuptextvisible());
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
		String num=generatenumber();
		reg.phone(num);
		reg.clickaccountcreate();
	     System.out.println(reg.accountCreated());
		reg.Continuebtn();
		boolean status2=reg.loginasname();
		Assert.assertEquals(status2, true);
		
		
		ProductsPage p=new ProductsPage(driver);
		p.hoverOnFirstProduct();
		p.addToCartFirstFunc();
		h.cartBtn();
		
		CartPage c=new CartPage(driver);
		boolean status1=c.verifyShoppingCartPage();
		Assert.assertEquals(status1, true);
		c.checkOutBtn();
		
		AddressDetails ad=new AddressDetails(driver);
		if(num.equalsIgnoreCase(ad.yourphone1()))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	
		
		
		
		
	}

}
