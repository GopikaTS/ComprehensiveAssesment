package com.urbanLadder.pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetGiftCards {

	WebDriver ldriver;
	Actions moveTo;
	WebDriverWait wait;
	
	
	public GetGiftCards(WebDriver rdriver) {
		ldriver=rdriver;
		moveTo =new Actions(ldriver);
		wait= new WebDriverWait(ldriver,20);
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),' Gift Cards ')]")
	@CacheLookup
	WebElement GiftCard;
	
	@FindBy(xpath="//h3[contains(text(),'Weddings')]")
	@CacheLookup
	WebElement weddingCard;
	
	@FindBy(xpath="//body/div[@id='app-container']/div[1]/main[1]/section[1]/section[2]/div[1]/section[2]/div[1]/button[1]")
	@CacheLookup
	WebElement money;
	
	@FindBy(xpath="//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement phonenum;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/div[4]/select[1]")
	@CacheLookup
	WebElement mon;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	@CacheLookup
	WebElement next;
	
	@FindBy(xpath="//input[@id='ip_4036288348']")
	@CacheLookup
	WebElement rname;
	
	@FindBy(xpath="//input[@id='ip_137656023']")
	@CacheLookup
	WebElement remail;
	
	@FindBy(xpath="//input[@placeholder='Your Name']")
	@CacheLookup
	WebElement uname;
	
	@FindBy(xpath="//*[@id='ip_4081352456']")
	@CacheLookup
	WebElement uemail;
	
	@FindBy(xpath="//*[@id='ip_2121573464']")
	@CacheLookup
	WebElement phone;
	
	@FindBy(xpath="//button[contains(text(),'Confirm')]")
	@CacheLookup
	WebElement submitbtn;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to payment')]")
	@CacheLookup
	WebElement payment;
	
	public void getCard() {
		GiftCard.click();
		}
	public void getBulk() {
		weddingCard.click();
		money.click();
		mon.click();
	   next.click();		
	}
	
	public void getrepN (String repname) {
		rname.sendKeys(repname);
	}
	
	public void getrepemail (String repmail) {
		remail.sendKeys(repmail);
	}
	
	public void getuname(String usname) {
		uname.sendKeys(usname);
	}
	
	public void getuemail(String usmail) {
		uemail.sendKeys(usmail);
		phone.sendKeys("9345678965");
		submitbtn.click();
		payment.click();
			}
	
	
	
	
	
	/*public void googleForm(String uname) {
		Set<String> WindowsHandling1=ldriver.getWindowHandles();
		List<String> list1 =new ArrayList<String>(WindowsHandling1);
	 {
		 
			ldriver.switchTo().window(list1.get(1));
			System.out.println(ldriver.getCurrentUrl());
			email.sendKeys(uname);
			phonenum.sendKeys("9876453423");
			
		
			
	}
	}*/
	
	
}
