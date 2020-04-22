package com.telecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

	@FindBy(xpath = "//a[contains(text(),'Add Customer')]")
	WebElement addCustomer;

	@FindBy(xpath = "//a[contains(text(),'Add Tariff Plan)]")
	WebElement addTariff;

	@FindBy(xpath = "//a[contains(text(),'Add Tariff Plan to Customer')]")
	WebElement addTariffCustomer;

	@FindBy(xpath = "//a[contains(text(),'Pay Billing')]")
	WebElement payBill;

	public AddCustomerPage addCustomer() {

		click(addCustomer);
		return new AddCustomerPage();

	}

	public AddTariffPage addTariff() {

		click(addTariff);
		return new AddTariffPage();

	}

	public AddTariffCustomerPage addTariffCustomer() {

		click(addTariffCustomer);
		return new AddTariffCustomerPage();

	}

	public BillPayPage payBill() {

		click(payBill);
		return new BillPayPage();

	}

}
