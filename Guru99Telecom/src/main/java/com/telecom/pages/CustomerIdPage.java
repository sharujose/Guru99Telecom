package com.telecom.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CustomerIdPage extends BasePage {

	@FindBy(xpath = "//table[@class='alt access']//td[2]")
	WebElement customerID;

	public String getID() {
		String customerId = customerID.getText();
		System.out.println(customerId);
		return customerId;
	}
}
