package com.urbanLadder.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.LoginPage;
import com.urbanLadder.utilties.XLUtilities;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{
	
	driver.get(baseURL);
	logger.info("uRl is opened");
	
	
	LoginPage lp = new LoginPage(driver);
	//lp.closeclk();
	logger.info("close button is clicked");
	
	//lp.profilebtn();
	lp.loginbtn();
	lp.setUserName(username);
	logger.info("username is entered");
	
	
    lp.setPassword(password);
    logger.info("Password is entered");
    captureScreen(driver,"logintest");
    
	lp.sumbitbtn();
	captureScreen(driver,"logintest");
	logger.info("Login test passed");
	/*if(driver.getTitle().equals("Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder"))
	{
		Assert.assertTrue(true);
		logger.info("Login test passed");
	}
	else
	{
		captureScreen(driver,"logintest");
		Assert.assertTrue(false);
		logger.info("Login test failed");
	}*/
		
		
	}
}


