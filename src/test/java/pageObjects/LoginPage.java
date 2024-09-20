package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='Login to your account']") WebElement verifyLogin;
	
	@FindBy(xpath="//input[@data-qa='login-email']") WebElement loginEmail;
	
	@FindBy(xpath="//input[@placeholder='Password']") WebElement loginPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement loginBtn;
	
	@FindBy(xpath="	//p[normalize-space()='Your email or password is incorrect!']") WebElement verifyInvalidDetails;
     

	public String verifyLoginFun()
	{
		try {
			return verifyLogin.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public void loginEmailFunc(String email)
	{
		loginEmail.sendKeys(email);
	}
	
	
	public void loginPasswordFunc(String pass)
	{
		loginPassword.sendKeys(pass);
	}
	
	
	public void loginBtnFunc()
	{
		loginBtn.click();
	}
	
	
	public String verifyDetails()
	{
		
		return verifyInvalidDetails.getText();
		
	}

}
