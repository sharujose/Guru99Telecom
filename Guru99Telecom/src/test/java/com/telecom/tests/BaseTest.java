package com.telecom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.telecom.browser.Driver;
import com.telecom.browser.DriverManager;

public class BaseTest {


	@BeforeMethod
	public void setUp() {
		try {
			Driver.initialize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}





	@AfterMethod
	public void wrapUp() {
		DriverManager.getDriver().close();
	}
}
