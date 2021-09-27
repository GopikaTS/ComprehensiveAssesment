package Runner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilies.ReadConfig;


public class BaseClass {
	
	
	ReadConfig readconfig = new ReadConfig();

	
  public String baseURL=readconfig.getApplicationURL();
  public String username=readconfig.getUsername();
  public String password=readconfig.getPassword();
  public String recipientName=readconfig.getrName();
  public String recipientEmail=readconfig.getrEmail();
  public String userNm =readconfig.getuserN();
  public String userEm =readconfig.getuseremail();
  
   public static WebDriver driver;
  public WebDriverWait wait;
  
  public static Logger logger;
  
  @Parameters("browser")
  @BeforeClass
  
  public void setup(String br)
  {
	  logger=Logger.getLogger("urban");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  
	  
	  if(br.equals("firefox")) {
	  System.setProperty("webdriver.gecko.driver","D:\\workspace\\urbanLadder\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 
		 
	  }
	  else if(br.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver","D:\\workspace\\urbanLadder\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
	  }
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get(baseURL);
		 
  }
  
  
  @AfterClass
  
  
  /*public void tearDown() 
 {
	  driver.quit();
	  	  
  }*/
  
  public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
}
