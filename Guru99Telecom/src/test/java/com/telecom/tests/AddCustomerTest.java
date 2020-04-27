package com.telecom.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.telecom.pages.AddCustomerPage;
import com.telecom.pages.CustomerIdPage;
import com.telecom.pages.LandingPage;

public class AddCustomerTest extends BaseTest {

	LandingPage landingPageObject;
	AddCustomerPage addCustomerPageObject;
	CustomerIdPage customerIdPageObject;
	
	
	
	
	@DataProvider(name="testData")
	public Object[][] getData()
	{
		return new Object[][]{
			{"neenu","sanja","neenu@gmail.com","9090909090","Test10"},
			{"meenu","sanjb","meenu@gmail.com","9090909091","Test11"},
			{"teenu","sanjc","teenu@gmail.com","9090909092","Test12"},
			{"geenu","sanju","geenu@gmail.com","9090909093","Test13"}
		};
	}
	
	

	@Test(dataProvider ="testData")
	
	public void addCustomer(String firstname,String lastName,String emailID,String mobNo,String address) throws Exception {
		landingPageObject = new LandingPage();
		addCustomerPageObject = landingPageObject.addCustomer();
		addCustomerPageObject.addFirstName(firstname).backgroundCheckDone().addlasttName(lastName)
				.addemail(emailID).mobile(mobNo).address(address);
		customerIdPageObject = addCustomerPageObject.submit();

		System.out.println(customerIdPageObject.getID());

	}
	


}
