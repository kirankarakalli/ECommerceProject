package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PaymentPage;
import pageObjects.ProductsPage;
import pageObjects.RegistrationUser;
import testBase.BaseClass;

public class LoginBeforeCheckout extends BaseClass {
	
	@Test
	public void LoginCheckoutMethod()
	{
		HomePage h=new HomePage(driver);
	    System.out.println(h.homeVisible());
	    h.signupLoginBtn();
	    
	    LoginPage l=new LoginPage(driver);
	   System.out.println( l.verifyLoginFun());
	   l.loginEmailFunc("kirankarakalli159@gmail.com");
	   l.loginPasswordFunc("Kirank@123");
	   l.loginBtnFunc();
	   
	   ProductsPage p=new ProductsPage(driver);
		p.hoverOnFirstProduct();
		p.addToCartFirstFunc();
		p.continueShop();
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
		pay.continueBtn();
		RegistrationUser reg=new RegistrationUser(driver);
		reg.deleteAccount();
		
	}

}
