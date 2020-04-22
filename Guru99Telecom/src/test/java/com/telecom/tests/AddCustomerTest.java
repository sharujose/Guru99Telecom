package com.telecom.tests;

import org.testng.annotations.Test;

import com.telecom.pages.AddCustomerPage;
import com.telecom.pages.CustomerIdPage;
import com.telecom.pages.LandingPage;

public class AddCustomerTest extends BaseTest {

	LandingPage landingPageObject;
	AddCustomerPage addCustomerPageObject;
	CustomerIdPage customerIdPageObject;

	@Test()
	public void addCustomer() throws Exception {
		landingPageObject = new LandingPage();
		addCustomerPageObject = landingPageObject.addCustomer();
		addCustomerPageObject.addFirstName("meenu").backgroundCheckDone().addlasttName("sim")
				.addemail("meenu@gmail.com").mobile("9090909090").address("test");
		customerIdPageObject = addCustomerPageObject.submit();

		System.out.println(customerIdPageObject.getID());

	}

}
