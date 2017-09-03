package com.test.automation.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * @author Mukesk Kumar Sah
 * @version 1.0 
 */
public class TestBase {

	public WebDriver driver;
	String url="http://automationpractice.com/index.php";
	String browser="firefox";
	public static Logger log=Logger.getLogger(TestBase.class.getName());
	public void init(){
		selectBrowser(browser);
		getUrl(url);
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}
	public void selectBrowser(String browser){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		} else if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
	}
	public void getUrl(String url){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		log.info("********* firefox browser launch successfull************");
	}
}
