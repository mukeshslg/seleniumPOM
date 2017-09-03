package com.test.automation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.automation.testBase.TestBase;

public class HomePage {

	WebDriver driver;
	public static Logger log=Logger.getLogger(HomePage.class.getName());
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;

	@FindBy(xpath = ".//*[@id='email']")
	WebElement loginEmailAddress;

	@FindBy(xpath = ".//*[@id='passwd']")
	WebElement loginPassword;

	@FindBy(xpath = ".//*[@id='SubmitLogin']")
	WebElement submitButton;

	@FindBy(xpath = ".//*[@id='center_column']/div[1]/ol/li")
	WebElement authonticationFailed;
	//*****
	
	@FindBy(id = "customer_firstname")
	WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	WebElement lastName;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "passwd")
	WebElement createPassword;
	
	@FindBy(id = "days")
	WebElement birthDays;
	
	@FindBy(id="id_gender1")
	WebElement gender;
	
	
	public void LoginToApplication(String emailAddress, String password) throws InterruptedException {
		signIn.click();
		log.info("**********clicking "+signIn.toString()+" object*****");
		Thread.sleep(1000);
		loginEmailAddress.sendKeys(emailAddress);
		Thread.sleep(1000);
		loginPassword.sendKeys(password);
		Thread.sleep(1000);
		submitButton.click();
		// Assert.assertEquals(authonticationFailed.getText(), "Authentication
		// failed.");
	}
	public String GetInvalidLoginText(){
		return authonticationFailed.getText();
	}
	public void registerUser() throws InterruptedException{
		Thread.sleep(6000);
		gender.click();
		firstName.sendKeys("Mukesh kumar");
		lastName.sendKeys("sah");
		email.sendKeys("abc@gmail.com");
		createPassword.sendKeys("password");
		Select select=new Select(birthDays);
		select.selectByValue("7");
		
	}

}
