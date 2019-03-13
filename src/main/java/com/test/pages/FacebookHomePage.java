/*
 * @author Nischal
 * 
 */

package com.test.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
	
	private By profileIcon = By.xpath("//span[contains(text(), 'Nischal')]");
	
	private By PhotoTab = By.xpath("//a[contains(text(), 'Photos')]");
	
	private By PhotoUpload = By.xpath("//input[@type='file' and @title = 'Choose a file to upload']");
	
	private By PostBttn = By.xpath("//span[contains(text(), 'Post')]");
	
	public FacebookHomePage(WebDriver driver) {

		super(driver);
		this.driver = driver;
		Log.info("Initializing Facebook home Page Objects");
		PageFactory.initElements(driver, FaceBookSearch);

	}


	public void postPhoto() throws InterruptedException, IOException, AWTException{
		//String filepath = "F:\\Projects\\Goscale\\FacebookAssessment\\EngineeraiTest\\PhotoToUpload\\Image.jpeg";
		String filepath= getTargetFilePath("PhotoToUpload", "Image", "jpeg");
		System.out.println("File path is:"+ filepath);
		
		click(profileIcon);
		Thread.sleep(1000);
		click(PhotoTab);
		Thread.sleep(1000);
		driver.findElement(PhotoUpload).sendKeys(filepath);
		click(PostBttn);
	}
	
	
}
