package com.urbanLadder.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.AddingWishList;
import com.urbanLadder.pageObjects.LoginPage;

public class TC_AddingWishList extends BaseClass {
	
	@Test
	public void addWishList() throws IOException {
		
		LoginPage Lp =new LoginPage(driver);
		AddingWishList AW = new AddingWishList(driver);
		Lp.loginbtn();
		Lp.setUserName(username);
		Lp.setPassword(password);
		Lp.sumbitbtn();
		AW.search();
		AW.wishList();
		captureScreen(driver,"AddingWishList");
		//AW.getBed();
		

	}

}
