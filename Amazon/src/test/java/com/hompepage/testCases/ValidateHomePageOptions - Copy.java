package com.hompepage.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.constans.AmazonConstants;
import com.amazon.testBase.TestBase;
import com.amazon.testdata.TestData;

public class ValidateHomePageOptions extends TestBase{

	boolean status = false;
	@Test
	public void validateSearchBar() {
		String userID = TestData.userName;
		String pass = TestData.pass;
		status = loginPage.login(driver,userID , pass);
		Assert.assertTrue(status); 
		status = homePage.validateSearchBar(driver,AmazonConstants.searchInput);
		Assert.assertTrue(status); 
	}
	
}
