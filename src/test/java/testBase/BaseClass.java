package testBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.Logger;
public class BaseClass {
	
	public static WebDriver driver;
	public Logger logger;
	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional("chrome")String br)
	{
		logger=LogManager.getLogger(this.getClass());
        
        
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();
		break;
		case "edge":driver=new FirefoxDriver();
		break;
		default:System.out.println("enter a valid browser");		
		}
		
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	public String generatestring()
	{
		String stringvalue=RandomStringUtils.randomAlphanumeric(6);
		return stringvalue;
	}
	
	
	public String generatenumber()
	{
		String stringvalue=RandomStringUtils.randomNumeric(10);
		return stringvalue;
	}
	
	public String randomAlphaNumeric()
	{
		String generatedstring= RandomStringUtils.randomNumeric(5);
		String generatednumber= RandomStringUtils.randomAlphabetic(5);
		return generatedstring+"@"+generatednumber;
	}

	public String captureScreen(String tname) {
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		String Targetpath=System.getProperty("user.dir")+"\\screenshots\\"+tname+"_"+timestamp+".png";
		File targetfile=new File(Targetpath);
		
		sourcefile.renameTo(targetfile);
		return Targetpath;
	}
	
	
}
