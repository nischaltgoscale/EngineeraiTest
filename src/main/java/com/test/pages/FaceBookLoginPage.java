/*
 * @author Nischal
 * 
 */

package com.test.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class FaceBookLoginPage extends BasePage {

	/** The Log. */
	private static Logger Log = LogManager.getLogger(FaceBookLoginPage.class.getName());

	/** The driver. */
//declare driver
	WebDriver driver;
	

	private By EmailField = By.id("email");
	
	private By PasswordField = By.id("pass");
	
	private By LoginBttn = By.id("u_0_2");
	
	public FaceBookLoginPage(WebDriver driver) {

		super(driver);
		this.driver = driver;
		Log.info("Initializing Facebook login Page Objects");
		PageFactory.initElements(driver, EmailField);

	}


	public void openApplication(){
		gotoURL("https://www.facebook.com");
	}
	
	public void loginIntoFb(String username, String password) throws InterruptedException{
		setValueInField(EmailField, username);
		setValueInField(PasswordField, password);
		click(LoginBttn);
		Thread.sleep(5000);;
	}
	
}
