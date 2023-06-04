package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.amzon.utils.TestInterface;

public class HomePage implements TestInterface{
	By amazonLogo = By.xpath("//a[@id='nav-logo-sprites']");
	By searchBar = By.xpath("//input[@id='twotabsearchtextbox']");
	By adress = By.xpath("//a[@id='nav-global-location-popover-link']");
	By searchButon = By.xpath("//input[@id='nav-search-submit-button']");
	boolean status = false;
	
	public boolean validateSearchBar(WebDriver driver,String serachInput) {
		status = testUtil.waitForElement(driver, searchBar);
		status = testUtil.clickElement(driver, searchBar);
		if(!status) {
			Reporter.log("Failed to click on SearchBar",true);
			return false;
		}
		status = testUtil.enterText(driver, searchBar, serachInput);
		if(status) {
			Reporter.log(serachInput+" entered in search bar",true);
		}else {
			Reporter.log(serachInput+" Failed to entered in search bar",true);
			return false;
		}
		status = testUtil.clickElement(driver, searchButon);
		if(!status) {
			Reporter.log("Failed to click on SearchButton",true);
			return false;
		}
		By category = By.xpath("//span[text()='"+serachInput+"']");
		status = testUtil.waitForElement(driver, category);
		if(status) {
			Reporter.log("The result is dispalying for the searched category "+serachInput,true);
		}else {
			Reporter.log("Faild to dispalying for the searched category "+serachInput,true);
		}
		return status;
	}

}
