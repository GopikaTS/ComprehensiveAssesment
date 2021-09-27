package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver ldriver;
	WebDriverWait wait;
	Actions moveTo;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		wait= new WebDriverWait(ldriver,20);
	    moveTo =new Actions(ldriver);
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	/*@FindBy(xpath="//a[contains(text(),'Close')]")
	WebElement close;
	

	@FindBy(css=".header-icon-link.user-profile-icon")
	@CacheLookup
	WebElement profile;*/
	
	@FindBy(xpath="//*[@id=\"signup-module\"]/div[3]/a")
	@CacheLookup
	WebElement login;
	
	@FindBy(xpath="//*[@placeholder='Email Address']")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//*[@value='Log In']")
	@CacheLookup
	WebElement submit;
	
	/*@FindBy(className="email required input_authentication")
	@CacheLookup
	WebElement txtUserName;
	
	public void closeclk() {
		wait.until(ExpectedConditions.visibilityOf(close));
		close.click();	
	}	
	public void profilebtn() {
		wait.until(ExpectedConditions.visibilityOf(profile));
		moveTo.moveToElement(profile).build().perform();
	
	}*/
	public void loginbtn() {
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
	}
	public void setUserName(String uname) {
		wait.until(ExpectedConditions.visibilityOf(txtusername));
		txtusername.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void sumbitbtn() {
		submit.click();
	}
	
	
	
	

}
