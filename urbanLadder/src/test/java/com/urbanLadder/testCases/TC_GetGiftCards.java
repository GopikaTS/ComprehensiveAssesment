package com.urbanLadder.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.AddingWishList;
import com.urbanLadder.pageObjects.GetGiftCards;
import com.urbanLadder.pageObjects.LoginPage;

public class TC_GetGiftCards extends BaseClass{

	@Test
	public void getGiftCard() throws IOException {
		LoginPage Lp =new LoginPage(driver);
		GetGiftCards card = new GetGiftCards(driver);
		Lp.loginbtn();
		Lp.setUserName(username);
		Lp.setPassword(password);
		Lp.sumbitbtn();
		card.getCard();
		card.getBulk();
		card.getrepN(recipientName);
		card.getrepemail(recipientEmail);
		card.getuname(userNm);
		card.getuemail(userEm);
		captureScreen(driver,"Paymentfor Card Order");
		
		
	}
}
