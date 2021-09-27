package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingWishList {
	WebDriver ldriver;
	Actions moveTo;
	WebDriverWait wait;
	
	public AddingWishList(WebDriver rdriver) {
		ldriver=rdriver;
		moveTo =new Actions(ldriver);
		wait= new WebDriverWait(ldriver,20);
		PageFactory.initElements(rdriver,this);
		}
	
	
	@FindBy(xpath="//input[@id='search']")
	@CacheLookup
	WebElement Search;
	
	@FindBy(id="search_button")
	@CacheLookup
	WebElement searchbtn;
	
	@FindBy(xpath="//*[@id='filters_availability_In_Stock_Only']")
	@CacheLookup
	WebElement checkBox;
	
	@FindBy(xpath="//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/div[6]/span[1]")
	@CacheLookup
	WebElement wish;
	
	@FindBy(xpath="//*[@id=\"search-results\"]/div[3]/ul/li[2]/div/div[6]/span[1]")
	@CacheLookup
	WebElement wish1;
	
	@FindBy(xpath="//*[@id=\"search-results\"]/div[3]/ul/li[6]/div/div[6]/span[1]")
	@CacheLookup
	WebElement wish2;
	
	/*@FindBy(css="body.two-col.ul_desktop.body_products:nth-child(2) div.container:nth-child(1) div.header__topBar:nth-child(2) div.header__topBar-content section.header__topBar_sectionRight ul.header__topBarIconList a.header-icon-link div:nth-child(1) span.header-icon svg:nth-child(1) > path:nth-child(1)")
	@CacheLookup
	WebElement wishbtn;*/
	
	public void search() {
		//wait.until(ExpectedConditions.visibilityOf(profile));
		Search.sendKeys("Bed");	
		searchbtn.click();
		checkBox.click();
		}
	public void wishList() {
		wish.click();
		wish1.click();
		wish2.click();
	}
		//ldriver.navigate().to("http://www.urbanladder.com/");
		/*JavascriptExecutor js = (JavascriptExecutor) ldriver;
	       js.executeScript("window.scrollBy(0,-350)", "");*/  
		
	/*public void getBed() {
		moveTo.moveToElement(Deal);
		moveTo.click(Deal);
	
	}*/
}	

