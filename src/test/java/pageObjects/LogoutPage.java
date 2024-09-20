package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver) {
		super(driver);
		
	}
	

	
	//h2[normalize-space()='Login to your account']
	
	@FindBy(xpath="//a[normalize-space()='Logout']") WebElement logoutBtn;
	
	@FindBy(xpath="	//h2[normalize-space()='Login to your account']") WebElement logoutBtnverify;
	
	
	public void clickLogout()
	{
		logoutBtn.click();
	}
	
	public String logoutBrnVerify()
	{
		try {
			return logoutBtnverify.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}

}
