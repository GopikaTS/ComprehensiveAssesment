package com.urbanLadder.pageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAddressOfStoreInChennai {
	WebDriver ldriver;
	WebDriverWait wait;
	Actions moveTo;
	public GetAddressOfStoreInChennai(WebDriver rdriver) {
		ldriver=rdriver;
		wait= new WebDriverWait(ldriver,20);
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Close')]")
	@CacheLookup
	WebElement close;
	
	@FindBy(linkText="Stores")
	@CacheLookup
	WebElement btnStore;
	
	@FindBy(xpath="//h3[contains(text(),'Nungambakkam, Chennai')]")
	@CacheLookup
	WebElement Addressclk;
	
	@FindBy(xpath="//div[contains(text(),'Ground Floor, Hafiz Court, 19, Kodambakkam High Ro')]")
	@CacheLookup
	WebElement txt;
	
	@FindBy(xpath="//div[contains(text(),'Nungambakkam, Next to News7 Tamil office')]")
	@CacheLookup
	WebElement txt1;
	
	@FindBy(xpath="//a[contains(text(),'hello@urbanladder.com')]")
	@CacheLookup
	WebElement emailid;
	
	@FindBy(xpath="//div[contains(text(),'11:00 AM to 08:00 PM')]")
	@CacheLookup
	WebElement openhrs;
	
	@FindBy(xpath="//a[contains(text(),'View on Google Maps')]")
	@CacheLookup
	WebElement googlemap;
	
	public void closeclk() {
		wait.until(ExpectedConditions.visibilityOf(close));
		close.click();	
	}	
	
	public void clickStore() {
		btnStore.click();
		Addressclk.click();
	}
	
	public void gettxt() {
		System.out.println(txt.getText());
		System.out.println(txt1.getText());
		System.out.println("Email-Id:"+emailid.getText());
		System.out.println("Timings:"+openhrs.getText());
		
	}
	//shows the google map Location of the store
	public void viewLocation() {
		googlemap.click();
		String parent =ldriver.getWindowHandle();
		Set<String> WH=ldriver.getWindowHandles();
		Iterator<String> I1=WH.iterator();
		while(I1.hasNext()) {
			String child=I1.next();
			if(!parent.equals(child)) {
				ldriver.switchTo().window(child);
				//ldriver.close();
			}
		}
		
		
	}

		
}
