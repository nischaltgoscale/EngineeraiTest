/*
 * @author Nischal
 * 
 */

package com.test.pages;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class FacebookHomePage extends BasePage {

	/** The Log. */
	private static Logger Log = LogManager.getLogger(FacebookHomePage.class.getName());

	/** The driver. */
//declare driver
	WebDriver driver;
	

	private By FaceBookSearch = By.name("q");
	
	private By PhotoUpload = By.id("js_ou");
	
	private By PostBttn = By.xpath("//span[contains(text(), 'Post')]");
	
	public FacebookHomePage(WebDriver driver) {

		super(driver);
		this.driver = driver;
		Log.info("Initializing Facebook home Page Objects");
		PageFactory.initElements(driver, FaceBookSearch);

	}


	public void postPhoto() throws InterruptedException, IOException{
		String filepath = getTargetFilePath("PhotoToUpload", "Image", "jpeg");
		driver.findElement(PhotoUpload).sendKeys(filepath);
		Thread.sleep(15000);
		click(PostBttn);
	}
	
	
}
