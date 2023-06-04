package com.hompepage.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionstudy {
	//Assert.assertEquals
	@Test
	public void verify1() {

		String actualText = "Amazon";
		String expectedText = "Amazon1";
		
		Assert.assertEquals(actualText,expectedText );
		System.out.println("sanket");
		
	}
	//Assert.assertNotEquals
	@Test
	public void verify2() {

		String actualText = "Amazon";
		String expectedText = "Amazon";
		
		Assert.assertNotEquals(actualText,expectedText );
		
	}
	//Assert.true
	@Test
	public void verify3() {
		boolean status = false;
		Assert.assertTrue(status);
	}
	//Assert.assertfalse
	@Test
	public void verify4() {
		boolean status = true;
		Assert.assertFalse(status);
	}
	//Assert.assertnull
	@Test
	public void verify5() {
		String str = null;
		String str2 = "";
		Assert.assertNull(str2);
	}
	//AssertNotNull
	@Test
	public void verify6() {
		String str = null;
		String str2 = "";
		Assert.assertNotNull(str2);
	}
	
	@Test
	public void verify7() {
		System.out.println("verify7");
		Assert.fail();
	}
	
}
