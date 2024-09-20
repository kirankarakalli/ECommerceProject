package testCases;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.PaymentPage;
import pageObjects.ProductsPage;
import pageObjects.RegistrationUser;
import testBase.BaseClass;

public class DownloadInvoice extends BaseClass{
	@Test
	void checkoutMethod()
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
		reg.phone(generatenumber());
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
		c.enterMsgForm("Deliver In Time");
		c.placeOrder();
		PaymentPage pay=new PaymentPage(driver);
		
		pay.cardNameUser(generatestring());
		pay.cardNumberOfUser(generatenumber());
		pay.cardCvc("315");
		pay.cardExpityMonthOfUser("2");
		pay.cardexpiryyearOfUser("2022");
		pay.submit();
		String msg3=pay.orderConfirmMsg();
		Assert.assertEquals(msg3, "Congratulations! Your order has been confirmed!");
		 pay.downloadInVoice();
       pay.continueBtn();
     
		
		reg.deleteAccount();
	
	}
}
