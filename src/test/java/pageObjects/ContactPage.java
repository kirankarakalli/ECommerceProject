package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage{

	public ContactPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='Get In Touch']") WebElement verifycontactus;
    
	@FindBy(xpath="//input[@placeholder='Name']") WebElement contactName;
	
	@FindBy(xpath="//input[@placeholder='Email']") WebElement contactEmail;
	
	@FindBy(xpath="//input[@placeholder='Subject']") WebElement subject;
	
	@FindBy(xpath="//textarea[@class='form-control']") WebElement formMsg;
	
	@FindBy(xpath="//input[@name='upload_file']") WebElement uploadFile;
	
	@FindBy(xpath="//input[@class='btn btn-primary pull-left submit_form']") WebElement submitBtn;
	
	@FindBy(xpath="//div[@class='status alert alert-success']") WebElement successmsg;
	
	@FindBy(xpath="//span[normalize-space()='Home']") WebElement home;
	
	@FindBy(xpath="//div[@class='item active']//span[1]") WebElement verifyHome;
	
	
	
	public boolean verifyContactPage()
	{
		return verifycontactus.isDisplayed();
	}
	
	
	public void cName(String name)
	{
		contactName.sendKeys(name);
	}
	
	
	public void cEmail(String email)
	{
		contactEmail.sendKeys(email);
	}
	
	
	public void cSubject(String Subject)
	{
		subject.sendKeys(Subject);
	}
	
	
	
	public void cForm(String msg)
	{
		formMsg.sendKeys(msg);
	}
	
	public void cUploadFile(String path)
	{
		subject.sendKeys(path);
	}
	
	public void submit()
	{
		submitBtn.click();
	}
	
	public String success()
	{
		return successmsg.getText();
	}
	
	public void clickHome()
	{
		home.click();
		
	}
	
	
	public String verifyhome()
	{
		return verifyHome.getText();
	}
	

}
