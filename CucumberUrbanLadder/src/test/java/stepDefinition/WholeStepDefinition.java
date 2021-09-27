package stepDefinition;

import org.openqa.selenium.WebDriver;

//import com.urbanLadder.pageObjects.FilterTheChair;

import PageObjects.AddingWishList;
import PageObjects.GetAddressOfStoreInChennai;
import PageObjects.GetGiftCards;
import PageObjects.LoginPage;
import PageObjects.FilterTheChair;
import Runner.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WholeStepDefinition extends BaseClass {
	
	WebDriver driver;
	//BaseClass BC= new BaseClass();
	LoginPage LP=new LoginPage(driver);
	GetAddressOfStoreInChennai GA = new GetAddressOfStoreInChennai(driver);
	AddingWishList add=new AddingWishList(driver);
	GetGiftCards get =new GetGiftCards(driver);
	FilterTheChair fil= new FilterTheChair(driver);
	
	@Given("^User is already in Login Page$")
	public void user_is_already_in_Login_Page() {
		
		driver.get(baseURL);	
	    
	}

	@Then("^User need to click on LogIn$")
	public void user_need_to_click_on_LogIn() {
		
		LP.loginbtn();	    
	   
	}

	@Then("^User enters username$")
	public void user_enters_username(){
	  
		LP.setUserName(username);
//		LP.setPassword(password);
	}
	
	@Then("^User enters password$")
	public void user_enters_password(){
	  
		
		LP.setPassword(password);
	}


	@Then("^User clicks on Loginbutton$")
	public void user_clicks_on_Loginbutton(){
	  
		LP.sumbitbtn();
	}
	@Given("^User is already in given URL$")
	public void user_is_already_in_given_URL(){
	    driver.get(baseURL);
	    GA.clickStore();
	}

	@Then("^User need to click on store$")
	public void user_need_to_click_on_store(){
	    GA.clickStore();
	}

	@Then("^User need to get address of chennai store$")
	public void user_need_to_click_on_chennai_store() {
	    GA.gettxt();
	}

	@Then("^user need click on Google Map$")
	public void user_need_click_on_Google_Map(){
	   GA.viewLocation();
	}
	@Then("^User enters bed in searchbox$")
	public void user_enters_bed_in_searchbox() {
	   add.search();
	}

	@Then("^User clicks on the items need to be added wishlist$")
	public void user_clicks_on_the_items_need_to_be_added_wishlist(){
	     add.wishList();  
	}
	
	@Then("^User clicks on Giftcard$")
	public void user_clicks_on_Giftcard() {
	   get.getCard();
	}

	@Then("^User clicks on WeddingCard$")
	public void user_clicks_on_WeddingCard()  {
	    get.getBulk();
	}

	@Then("^User clicks on Money$")
	public void user_clicks_on_Money(){
	    get.getBulk();
	}

	@Then("^User hovers on Month and clicks on Next Button$")
	public void user_hovers_on_Month_and_clicks_on_Next_Button(){
	  get.getBulk();
	}

	@Then("^User enters the Recipitent Name and Email$")
	public void user_enters_the_Recipitent_Name_and_Email(){
	    get.getrepN(recipientName);
	    get.getrepemail(recipientEmail);
	}
	

	@Then("^User enters the Username and Useremail$")
	public void user_enters_the_Username_and_Useremail(){
		get.getuname(userNm);
		get.getuemail(userEm);
	}

	@Then("^User enters Dinnig Chair in searchbox$")
	public void user_enters_Dinnig_Chair_in_searchbox(){
		fil.search();
	
	}

	@Then("^User need to select the Category$")
	public void user_need_to_select_the_Category() {
fil.selectCategory();
	}

	@Then("^User need to select the Price$")
	public void user_need_to_select_the_Price(){
		fil.selectPrice();
	}

@Then("^User need to select the Chair$")
	public void User_need_to_select_the_Chair() 
{
		fil.selectChair();
	}
}








