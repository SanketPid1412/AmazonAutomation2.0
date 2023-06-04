package com.amzon.utils;

import org.testng.asserts.SoftAssert;

import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;

public interface TestInterface {
	TestUtil testUtil = new TestUtil();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	SoftAssert soft= new SoftAssert();
}
