package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{

	public PaymentPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//li[@class='active']")WebElement paymentPage;
	@FindBy(xpath="//input[@class='form-control']")WebElement cardName;
	@FindBy(xpath="//input[@class='form-control card-number']")WebElement cardNumber;
	@FindBy(xpath="//input[@class='form-control card-cvc']")WebElement cardCVC;
	@FindBy(xpath="//input[@class='form-control card-expiry-month']")WebElement cardExpiryMonth;
	@FindBy(xpath="//input[@class='form-control card-expiry-year']")WebElement cardExpiryYear;
	@FindBy(xpath="//button[@class='form-control btn btn-primary submit-button']")WebElement submitOrder;
	
	@FindBy(xpath="//p[normalize-space()='Congratulations! Your order has been confirmed!']")WebElement orderConfirm;
	@FindBy(xpath="//a[@class='btn btn-primary']")WebElement Continue;
	@FindBy(xpath="//a[@class='btn btn-default check_out']")WebElement downloadInvoice;
	
    public void downloadInVoice()
    {
    	downloadInvoice.click();
    }
	
	public boolean verifyPaymentPage()
	{
		return paymentPage.isDisplayed();
	}

	
	public void cardNameUser(String user)
	{
		cardName.sendKeys(user);
	}
	
	public void cardNumberOfUser(String number)
	{
		cardNumber.sendKeys(number);
	}
	
	public void cardCvc(String cvc)
	{
		cardCVC.sendKeys(cvc);
	}
	
	public void cardExpityMonthOfUser(String month)
	{
		cardExpiryMonth.sendKeys(month);
	}
	
	public void cardexpiryyearOfUser(String year)
	{
		cardExpiryYear.sendKeys(year);
	}
	
	public void submit()
	{
		submitOrder.click();
	}
	
	public String orderConfirmMsg()
	{
		return orderConfirm.getText();
	}
	
	public void continueBtn()
	{
		Continue.click();
	}
	
	
	
}
