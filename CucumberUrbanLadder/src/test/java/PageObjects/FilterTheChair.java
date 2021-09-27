package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterTheChair {
	WebDriver ldriver;
	Actions moveTo;
	WebDriverWait wait;
	
	public FilterTheChair(WebDriver rdriver) {
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
	
	@FindBy(xpath="//li[@data-group='category']")
	@CacheLookup
	WebElement category;
	
	@FindBy(xpath="//label[contains(text(),'Kids Chair')]")
	@CacheLookup
	WebElement Kchair;
	
	@FindBy(xpath="//li[@data-group='price']")
	@CacheLookup
	WebElement Price;
	
	@FindBy(xpath="//input[@id='price_limit_5000-9999']")
	@CacheLookup
	WebElement Rate;
	
	@FindBy(xpath="//li[@data-group='colour']")
	@CacheLookup
	WebElement Colour;
	
	@FindBy(xpath="//input[@id='filters_primary_colors_Greens']")
	@CacheLookup
	WebElement Green;
	
	@FindBy(xpath="//*[@class='withsubtext']")
	@CacheLookup
	WebElement clk;
	@FindBy(xpath="//div[contains(text(),'(Misty Turquoise, Painted Finish)')]")
	@CacheLookup
	WebElement painted;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[5]/div[2]/a[2]")
	@CacheLookup
	WebElement option;
	
	
	public void search() {
		//wait.until(ExpectedConditions.visibilityOf(profile));
		Search.sendKeys(" Dinning Chair");	
		searchbtn.click();
	}
	
	public void selectCategory() {
		//wait.until(ExpectedConditions.visibilityOf(profile));
		moveTo.moveToElement(category).build().perform();
		Kchair.click();
		moveTo.moveToElement(clk).build().perform();
		clk.click();
	
	
}
	public void selectPrice() {
		wait.until(ExpectedConditions.visibilityOf(clk));
		moveTo.moveToElement(clk).build().perform();
		ldriver.navigate().back();
		moveTo.moveToElement(Price).build().perform();
		Rate.click();
		moveTo.moveToElement(clk).build().perform();
}
	/*public void selectColour() {
		//wait.until(ExpectedConditions.visibilityOf(profile));
		moveTo.moveToElement(Colour).build().perform();
		Green.click();
		moveTo.moveToElement(clk).build().perform();
		clk.click();
}*/
	public void selectChair() {
		moveTo.moveToElement(painted).build().perform();
		option.click();
		
	}
	
}
