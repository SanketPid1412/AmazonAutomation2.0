package com.login.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.constans.AmazonConstants;
import com.amazon.testBase.TestBase;
import com.amazon.testdata.TestData;

public class ValidateLoginFunctionality extends TestBase {
	boolean status;
	@Test
	public void validateLogin() {
		String userID = TestData.userName;
		String pass = TestData.pass;
		status = loginPage.login(driver,userID , pass);
		Assert.assertTrue(status);
	}
	
	@Test
	public void validateInvalidPhoneNumberErrorMessage() {
		String incorrectUserName = AmazonConstants.incorrectUserName;
		String invalidPhoneNumberErrorMessage = AmazonConstants.invalidPhoneNumberErrorMessage;
		status=loginPage.validateIncorrectUesrIDErrorMsg(driver,incorrectUserName , invalidPhoneNumberErrorMessage);
		Assert.assertTrue(status);
	}
	@Test
	public void assertionStudy() {
		boolean status= true;
		Assert.assertTrue(status);
		System.out.println("Status is "+status);
	}
}
