package com.telecom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.telecom.browser.Driver;
import com.telecom.browser.DriverManager;
import com.telecom.constants.Constants;

public class BasePage {

	public BasePage() {
		
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	
	

	public static void click(WebElement element)
	{
		explicitwait(element);
		element.click();
	}

	public static void explicitwait(WebElement element) {
		// TODO Auto-generated method stub

		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Constants.EXPLICITWAIT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	public static void explicitwaitPresence(By by) {
		// TODO Auto-generated method stub

		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Constants.EXPLICITWAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public static void click(By by)
	{
		explicitwait(DriverManager.getDriver().findElement(by));
		click(DriverManager.getDriver().findElement(by));
	}



	public static void sendkeys(WebElement element, String text)  {
		explicitwait(element);
		element.sendKeys(text);
		//LogStatus.pass(text + " is entered in to the "+ element);
	}

	public static void sendkeys(By by, String text)  {
		sendkeys(DriverManager.getDriver().findElement(by), text);
	}

	
	

	public void switchFrame(String frameid,By frameclose) {
		//frame("flow_close_btn_iframe");
		DriverManager.getDriver().switchTo().frame(frameid);
		click(frameclose);
		DriverManager.getDriver().switchTo().defaultContent();
	}

	



}
