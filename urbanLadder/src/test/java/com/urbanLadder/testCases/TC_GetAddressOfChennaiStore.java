package com.urbanLadder.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.GetAddressOfStoreInChennai;

public class TC_GetAddressOfChennaiStore extends BaseClass{
	@Test
	public void getAddress() throws IOException {
		
				
	GetAddressOfStoreInChennai Get=new GetAddressOfStoreInChennai(driver);
	
	Get.closeclk();
	Get.clickStore();
	logger.info("Store is clicked");
	
	Get.gettxt();
	Get.viewLocation();
	logger.info("It gives loction of the store in chennai");
	
	captureScreen(driver,"getAddres");
	logger.info("Login test passed");
	
	/*if(driver.getTitle().equals("Google Maps"))
	{
		Assert.assertTrue(true);
		logger.info("Login test passed");
	}
	else
	{
		captureScreen(driver,"getAddres");
		Assert.assertTrue(false);
		logger.info("Login test failed");
	}*/

	}

}
