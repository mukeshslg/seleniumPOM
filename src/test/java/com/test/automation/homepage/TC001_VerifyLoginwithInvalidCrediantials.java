package com.test.automation.homepage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.testBase.TestBase;
import com.test.automation.uiActions.HomePage;

public class TC001_VerifyLoginwithInvalidCrediantials extends TestBase {
	//WebDriver driver; not required because inheriting frm parent class
	HomePage homepage;
	public static Logger log=Logger.getLogger(TC001_VerifyLoginwithInvalidCrediantials.class.getName());
	@BeforeTest
	void setup() {
		init();
		log.info("***************initialization done************");
	}

	@Test
	void verifyLoginwithInvalidCrediantials() throws InterruptedException {
		log.info("*****************starting verifyLoginwithInvalidCrediantials TC001 method******");
		homepage = new HomePage(driver);//initializing driver through pagefactory
		homepage.LoginToApplication("test.slg@gmail.com", "password1");
		Assert.assertEquals(homepage.GetInvalidLoginText(),"Authentication failed.");
		log.info("*****************ending verifyLoginwithInvalidCrediantials method******");
	}

	@AfterTest
	void endTest() {
		log.info("*******closing browser******");
		//driver.close();
	}
}
