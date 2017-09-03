package com.test.automation.homepage;

import org.testng.annotations.Test;


import com.test.automation.testBase.TestBase;
import com.test.automation.uiActions.HomePage;

import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;

public class TC002_VerifyRegistration extends TestBase{
  public static Logger log=Logger.getLogger(TC002_VerifyRegistration.class.getName());
	
  @BeforeClass
  public void beforeClass() {
	  log.info("**************Launching browser********");
	  init();
  }

  @Test
  public void testLogin() throws InterruptedException {
	  log.info("**************Starting Testcase 002 execusion********");
	  HomePage homePage=new HomePage(driver);
	  homePage.registerUser();
	  log.info("**************ending Testcase 002 execusion********");
	  
  }
  
  @AfterClass
  public void afterClass() {
	  log.info("*****closing browser*****");
	  driver.close();
	  
  }

}
