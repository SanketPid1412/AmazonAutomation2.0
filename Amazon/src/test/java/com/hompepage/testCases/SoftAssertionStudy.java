package com.hompepage.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.amzon.utils.TestInterface;

public class SoftAssertionStudy implements TestInterface{
	
	@Test
	public void verify1() {
		String actualText = "abc";
		String expectedText = "xyz";
		String actualText1 = "Flipkart";
		String expectedText1 = "Flipkart";
		
		soft.assertEquals(actualText, expectedText,"This values are not equal");
		soft.assertEquals(actualText1, expectedText1,"This values are not equal");
		System.out.println("This test case is getting failed");
		soft.assertAll();
	}
}
