package com.telecom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.telecom.browser.DriverManager;

public class AddCustomerPage extends BasePage {

	@FindBy(xpath = "//input[@type='radio']/following::label[@for='done']")
	WebElement doneRadioButton;

	@FindBy(id = "pending")
	WebElement pendingRadioButton;

	@FindBy(id = "fname")
	WebElement firstName;

	@FindBy(id = "lname")
	WebElement lastName;

	@FindBy(id = "email")
	WebElement emailId;

	@FindBy(name = "addr")
	WebElement addressBox;

	@FindBy(id = "telephoneno")
	WebElement telephoneno;

	@FindBy(name = "submit")
	WebElement submitButton;

	@FindBy(xpath = "//input[@class='alt']")
	WebElement resetButton;

	By frameclose = By.xpath("//div[@id='closeBtn']");

	public AddCustomerPage backgroundCheckDone() throws InterruptedException {

		click(doneRadioButton);
		return this;
	}

	public AddCustomerPage addFirstName(String firstname) throws Exception {

		switchFrame("flow_close_btn_iframe", frameclose);

		sendkeys(firstName, firstname);
		return this;
	}

	public AddCustomerPage addlasttName(String lastname) {
		sendkeys(lastName, lastname);
		return this;
	}

	public AddCustomerPage addemail(String emailid) {
		sendkeys(emailId, emailid);
		return this;
	}

	public AddCustomerPage address(String address) {
		addressBox.sendKeys(Keys.TAB);
		addressBox.clear();

		sendkeys(addressBox, address);
		return this;
	}

	public AddCustomerPage mobile(String mobileno) {
		sendkeys(telephoneno, mobileno);
		return this;
	}

	public CustomerIdPage submit() {
		click(submitButton);
		return new CustomerIdPage();
	}
}
