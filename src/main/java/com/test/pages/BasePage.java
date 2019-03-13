/*
 * @author Nischal
 */

package com.test.pages;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
	

	/** The Log. */
	private static Logger Log = LogManager.getLogger(BasePage.class.getName());

	/** The driver. */
	protected WebDriver driver;

		
	/**
	 * Instantiates a new base page.
	 *
	 * @param driver the driver
	 */
	// Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		Log.info("Initialized Base Page Class");
	}

	/**
	 * Goto URL.
	 *
	 * @param url the url
	 */
	// open url method
	public void gotoURL(String url) {
		driver.get(url);
	}
	
	public void setValueInField(By locator, String text) {
		WebElement el = driver.findElement(locator);
		el.clear();
		el.sendKeys(text);
	}
	
	public void click(By locator) {
		WebElement el = driver.findElement(locator);
		el.click();
	
	}
	
	public String getTargetFilePath(String folderName, String fileName, String ext) throws IOException {
		String rootPath = new File(".").getCanonicalPath();
		String fullPath = String.format("%s//%s//%s.%s", rootPath, folderName, fileName, ext);
		return fullPath;
	}
}