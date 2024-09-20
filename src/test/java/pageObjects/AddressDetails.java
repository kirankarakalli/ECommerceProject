package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressDetails extends BasePage {

	public AddressDetails(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	@FindBy(xpath=" //*[@id=\"address_delivery\"]/li[2]")WebElement name;
	@FindBy(xpath=" //*[@id=\"address_delivery\"]/li[3]")WebElement company;
	@FindBy(xpath=" //*[@id=\"address_delivery\"]/li[4]")WebElement address;
	@FindBy(xpath=" //*[@id=\"address_delivery\"]/li[5]")WebElement address2;
	@FindBy(xpath=" //*[@id=\"address_delivery\"]/li[6]")WebElement statecityPincode;
	@FindBy(xpath=" //*[@id=\"address_delivery\"]/li[7]")WebElement country;
	@FindBy(xpath=" //*[@id=\"address_delivery\"]/li[8]")WebElement phoneno;
	
	@FindBy(xpath="//*[@id=\"address_invoice\"]/li[2]")WebElement name1;
	@FindBy(xpath="//*[@id=\"address_invoice\"]/li[3]")WebElement company1;
	@FindBy(xpath="//*[@id=\"address_invoice\"]/li[4]")WebElement address1;
	@FindBy(xpath="//*[@id=\"address_invoice\"]/li[5]")WebElement address21;
	@FindBy(xpath="//*[@id=\"address_invoice\"]/li[6]")WebElement statecityPincode1;
	@FindBy(xpath="//*[@id=\"address_invoice\"]/li[7]")WebElement country1;
	@FindBy(xpath="//*[@id=\"address_invoice\"]/li[8]")WebElement phoneno1;
	
	
	
	public String yourName()
	{
		return name.getText();
	}
	
	public String yourCompany()
	{
		return company.getText();
	}
	
	public String youraddress()
	{
		return address.getText();
	}
	
	public String youraddress2()
	{
		return address2.getText();
	}
	
	public String yourstate()
	{
		return statecityPincode.getText();
	}
	
	public String yourcountry()
	{
		return country.getText();
	}
	
	public String yourphone()
	{
		return phoneno.getText();
	}
	
	
	
	public String yourName1()
	{
		return name1.getText();
	}
	
	public String yourCompany1()
	{
		return company1.getText();
	}
	
	public String youraddress1()
	{
		return address1.getText();
	}
	
	public String youraddress21()
	{
		return address21.getText();
	}
	
	public String yourstate1()
	{
		return statecityPincode1.getText();
	}
	
	public String yourcountry1()
	{
		return country1.getText();
	}
	
	public String yourphone1()
	{
		return phoneno1.getText();
	}
	

}
