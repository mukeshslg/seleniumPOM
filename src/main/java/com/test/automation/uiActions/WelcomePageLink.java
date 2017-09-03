package com.test.automation.uiActions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * @author Mukesh Kumar Sah
 * @version 1.0
 */
public class WelcomePageLink {
	WebDriver driver;
	public static Logger log=Logger.getLogger(WelcomePageLink.class.getName());
	
	public WelcomePageLink(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLinkinWelcomePg(String linkNameToClick){
		List<WebElement> l=driver.findElements(By.tagName("a"));
		boolean flagLinkClicked=false;
		for (WebElement element : l) {
			if (element.getText().equalsIgnoreCase(linkNameToClick)) {
				try{
				if (element.isDisplayed()) {
					element.click();
					Assert.assertTrue(true, linkNameToClick+" link is displayed and clicked");
				}
				}catch(NoSuchElementException e){
					e.printStackTrace();
					log.info("****element not found exception handled****");
				}
				
				log.info("*********link "+linkNameToClick+" clicked successfully********");
				flagLinkClicked=true;
				
			} 
			if (flagLinkClicked) {
				break;
			}
		}
		if (!flagLinkClicked) {
			log.info("*********link  not found to perform click********");
		}
	}
	
}
