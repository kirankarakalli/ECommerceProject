package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationUser extends BasePage{

	public RegistrationUser(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']") WebElement signuptext;
	
	@FindBy(xpath="//input[@placeholder='Name']") WebElement userName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']") WebElement email;
	
	@FindBy(xpath="//button[normalize-space()='Signup']") WebElement signupbtn;
	
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']") WebElement verifyaccountlogo;
	
    @FindBy(xpath="//input[@id='id_gender1']") WebElement malechkbox;
	
	@FindBy(xpath="//input[@id='id_gender2']") WebElement femalechkbox;
	
	@FindBy(xpath="	//input[@name='password']") WebElement password;
	
	@FindBy(xpath="//select[@name='days']") WebElement dobday;
	
	@FindBy(xpath="//select[@name='months']") WebElement dobmonth;
	
	@FindBy(xpath="//select[@name='years']") WebElement dobyear;
	
	
	@FindBy(xpath="//input[@id='newsletter']") WebElement newscheckbox;
	
	@FindBy(xpath="//input[@id='optin']") WebElement offercheckbox;
	
	@FindBy(xpath="//input[@name='first_name']") WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']") WebElement lastName;
	
	@FindBy(xpath="//input[@name='company']") WebElement company;
	
	@FindBy(xpath="	//input[@name='address1']") WebElement address;
	
	@FindBy(xpath="//select[@name='country']") WebElement country;
	
	
	@FindBy(xpath="//input[@name='state']") WebElement state;
	
	@FindBy(xpath="	//input[@name='city']") WebElement city;
   
	@FindBy(xpath="//input[@name='zipcode']") WebElement zipcode;
	
	@FindBy(xpath="//input[@name='mobile_number']") WebElement mobilenumber;
	
	@FindBy(xpath="//button[normalize-space()='Create Account']") WebElement createaccbtn;
	
	

	@FindBy(xpath="//b[normalize-space()='Account Created!']") WebElement accountcreated;
	
	@FindBy(xpath="	//a[@class='btn btn-primary']") WebElement Continue;
	
	@FindBy(xpath="//li[10]//a[1]") WebElement loggedinasname ;
	
	@FindBy(xpath="//a[normalize-space()='Delete Account']") WebElement deleteaccbtn;
	
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']") WebElement accountdeleted;
	
	@FindBy(xpath="//p[normalize-space()='Email Address already exist!']") WebElement emailExist;
	public String signuptextvisible()
	{
		try {
			return signuptext.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		
	}
	
	
	public void username(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void useremail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void signup()
	{
		signupbtn.click();
	}
	
	
	public String verifyaccountinfovisible()
	{
		try {
			return verifyaccountlogo.getText();
			
		}
		catch(Exception e)
		{
			return emailExist.getText();
			
		}
	}
	
	
    public void mrcheckbox()
    {
    	malechkbox.click();
    }
	

    public void mrscheckbox()
    {
    	femalechkbox.click();
    }
	
    public void Password(String pass)
    {
    	password.sendKeys(pass);
    }
    
    public void day(String Day)
    {
    	dobday.click();
    	Select s =new Select(dobday);
    	s.selectByValue(Day);
    }
	
    public void month(String Month)
    {
    	dobmonth.click();
    	Select s =new Select(dobmonth);
    	s.selectByValue(Month);
    }
    
    public void year(String Year)
    {
    	dobyear.click();
    	Select s =new Select(dobyear);
    	s.selectByValue(Year);
    }
    
    public void  newsCheck()
    {
    	newscheckbox.click();
    }
    
    public void offerCheck()
    {
    	offercheckbox.click();
    }
    
    

	public void firstname(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void lastname(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	public void Address(String addr)
	{
		address.sendKeys(addr);
	}
	
	public void Country(String coun)
	{
		country.click();
		Select s =new Select(country);
    	s.selectByValue(coun);
	}
	
	public void State(String statename)
	{
		state.sendKeys(statename);
	}

	public void City(String cityname)
	{
		city.sendKeys(cityname);
	}
	
	public void Zipcode(String zipcodeval)
	{
		zipcode.sendKeys(zipcodeval);
	}
	
	public void phone(String num)
	{
		mobilenumber.sendKeys(num);
	}
	
	public void clickaccountcreate()
	{
		createaccbtn.click();
	}

	
	public  String accountCreated()
	{
		try {
			return accountcreated.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public void Continuebtn()
	{
		Continue.click();
	}
	
	
    public boolean loginasname()
    {
    	return loggedinasname.isDisplayed();
    	
    }
    
    
    public void deleteAccount()
    {
    	deleteaccbtn.click();
    }
    
	public String accountDeleted()
	{
		try {
			return accountdeleted.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public void Company(String comp)
	{
		company.sendKeys(comp);
	}


}
