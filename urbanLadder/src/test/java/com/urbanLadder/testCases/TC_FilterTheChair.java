package com.urbanLadder.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.FilterTheChair;
import com.urbanLadder.pageObjects.GetGiftCards;
import com.urbanLadder.pageObjects.LoginPage;

public class TC_FilterTheChair extends BaseClass{
	@Test
	public void loginTest() throws IOException
	{
	LoginPage Lp =new LoginPage(driver);
	FilterTheChair filter= new FilterTheChair(driver);
	Lp.loginbtn();
	Lp.setUserName(username);
	Lp.setPassword(password);
	Lp.sumbitbtn();
	filter.search();
	filter.selectCategory();
	filter.selectPrice();
	filter.selectChair();
	
}
}
