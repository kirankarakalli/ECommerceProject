package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasePage extends BasePage {

	public TestCasePage(WebDriver driver) {
		super(driver);
		
	}
	


	
	
	
	@FindBy(xpath="//b[normalize-space()='Test Cases']") WebElement testCase;
	
	public String validTestCasePage()
	{
		return testCase.getText();
	}

}
