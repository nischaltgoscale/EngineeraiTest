package com.test.scripts;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class FacebookTest extends BaseTest{
	
	/** The Log. */
	private static Logger Log = LogManager.getLogger(FacebookTest.class.getName());
	
  @Test
  public void googletest() throws InterruptedException, IOException 
  {
	String username = "nischalt@goscale.co";
	String password = "Updoer.17";
	
	Log.info("Navigate to Facebook");
	pages.getFacebookPage().openApplication();
	
	
	Log.info("Login to FB");
	pages.getFacebookPage().loginIntoFb(username, password);
	
	Log.info("Post Photo");
	pages.getFacebookHomePage().postPhoto();
	
  }


}