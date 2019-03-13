package com.test.pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;

/**
 * Created By : Nischal.
 */

public class PageCollection {

	/** The driver. */
	private WebDriver driver;

	/** The Facebook login  page. */
	private FaceBookLoginPage facebookPage;
	/** The Facebook Home  page. */
	private FacebookHomePage facebookHomePage;
	/**
	 * Instantiates a new page collection.
	 *
	 * @param driver the driver
	 */
	public PageCollection(WebDriver driver) {

		this.driver = driver;
		
	}

	/**
	 * Gets the google Home page.
	 *
	 * @return the google Home page
	 */
	public FaceBookLoginPage getFacebookPage() {

		return (facebookPage == null) ? facebookPage = new FaceBookLoginPage(driver) : facebookPage;

	}
	
	public FacebookHomePage getFacebookHomePage() {

		return (facebookHomePage == null) ? facebookHomePage = new FacebookHomePage(driver) : facebookHomePage;

	}
}

