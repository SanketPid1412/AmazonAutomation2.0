package com.amazon.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.amazon.testdata.TestData;
import com.amzon.utils.TestInterface;


public class TestBase implements TestInterface{
	protected WebDriver driver = null;
	@BeforeMethod
	public void testSetup() throws InterruptedException {
		driver= openBrowser("Chrome");
		openApplication(TestData.url, driver);
	}
	
	public WebDriver openBrowser(String BrowserName) {
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SimplilearnSpace\\chromedriver.exe");
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--remote-allow-origins=*");
//			driver = new ChromeDriver(options);
			driver = new ChromeDriver();
		}else if(BrowserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\SimplilearnSpace\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(BrowserName.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SimplilearnSpace\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	public void openApplication(String url,WebDriver driver) {
		driver.get(url);
	}
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	@AfterMethod
	public void tearDown() {
		testUtil.sleep(3000);
		closeBrowser(driver);
	} 
}
