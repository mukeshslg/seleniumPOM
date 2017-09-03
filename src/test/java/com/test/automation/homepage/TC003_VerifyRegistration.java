package com.test.automation.homepage;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.testBase.TestBase;
import com.test.automation.uiActions.HomePage;
import com.test.automation.uiActions.WelcomePageLink;

public class TC003_VerifyRegistration extends TestBase {
	
	public static Logger log=Logger.getLogger(TC003_VerifyRegistration.class.getName());
	
	  @BeforeClass
	  public void beforeClass() {
		  log.info("**************Launching browser********");
		  init();
	  }

	  @Test
	  public void testLogin() throws InterruptedException {
		  log.info("**************Starting Testcase 003 execusion********");
		  HomePage homePage=new HomePage(driver);
		  homePage.LoginToApplication("test.slg@gmail.com", "password");
		  WelcomePageLink link=new WelcomePageLink(driver);
		  Thread.sleep(2000);
		  link.clickLinkinWelcomePg("T-SHIRTS");
		  
			
		  log.info("**************ending Testcase 003 execusion********");
		  
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  log.info("*****closing browser*****");
		 // driver.close();
		  
	  }


}
