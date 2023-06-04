package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.amzon.utils.TestInterface;

public class LoginPage implements TestInterface {
	By userIDField = By.xpath("//input[@id='ap_email']");
	By continueButton = By.xpath("//input[@id='continue']");
	By passField = By.xpath("//input[@id='ap_password']");
	By signInButton = By.xpath("//input[@id='signInSubmit']"); 
	By userNameInHomePage = By.xpath("//span[text()='Hello, sanket']");
	By incoreectPhoneNumber = By.xpath("//div[@class='a-box-inner a-alert-container']//h4");
	Boolean status ;
	public boolean enterUserID(WebDriver driver,String userID) {
		status = testUtil.enterText(driver, userIDField, userID);
		if(status) {
			Reporter.log("UserId enterend "+ userID+" Successfully", true);
		}else {
			Reporter.log("Entering userID "+ userID+" got failed", true);
		}
		return status;
	}
	public Boolean enterPassword(WebDriver driver,String pass) {
		testUtil.waitForElement(driver, passField);
		status = testUtil.enterText(driver, passField, pass);
		if(status) {
			Reporter.log("Password enterend "+ pass+" Successfully", true);
		}else {
			Reporter.log("Entering Password "+ pass+" got failed", true);
		}
		return status;
	}
	public Boolean clickContinueButton(WebDriver driver) {
		status = testUtil.clickElement(driver, continueButton);
		if(status) {
			Reporter.log("Clicked on continue button");
		}else {
			Reporter.log("Click on continue button got failed");
		}
		return status;
	}
	public Boolean clickSignInButton(WebDriver driver) {
		status = testUtil.clickElement(driver, signInButton);
		if(status) {
			Reporter.log("Clicked on SignIn button");
		}else {
			Reporter.log("Click on SignIn button got failed");
		}
		return status;
	}
	public boolean validateUserName(WebDriver driver) {
		status = testUtil.waitForElement(driver, userNameInHomePage);
		if(status) {
			Reporter.log("User Logged In successFully",true);
		}else {
			Reporter.log("User login faild",true);
		}
		return status;
	}
	public boolean login(WebDriver driver, String userID,String pass) {
		status = enterUserID(driver, userID);
		status = clickContinueButton(driver);
		status = enterPassword(driver, pass);
		status = clickSignInButton(driver);
		status = validateUserName(driver);
		if(!status) {
			Reporter.log(userID+ " User Login faild",true);
		}
		return status;
	}
	public boolean validateIncorrectUesrIDErrorMsg(WebDriver driver,String userID,String expectedErrorMsg) {
		status = enterUserID(driver, userID);
		status = clickContinueButton(driver);
		String actualMsg = testUtil.getText(driver, incoreectPhoneNumber);
		status = actualMsg.equals(expectedErrorMsg);
		if(status) {
			Reporter.log("Expected toaster msg dispalyed",true);
		}else {
			Reporter.log("Expected toaster msg display failed",true);
		}
		return status;
	}
}
