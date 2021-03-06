package com.telecom.browser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.telecom.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public WebDriver driver = null;
	public DesiredCapabilities capability;
	public Properties prop;

	private Driver() {

		try {

			prop = new Properties();
			//			FileInputStream fis = new FileInputStream(Constants.PROPERTIESPATH);
			prop.load(Driver.class.getClassLoader().getSystemResourceAsStream(Constants.CONFIG_PROPERTIES));
			String browserName = prop.getProperty("browsername");
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICITWAIT, TimeUnit.SECONDS);

		try {
			driver.get(prop.getProperty("url"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		DriverManager.setWebDriver(driver);

	}

	public static void initialize() {
		if (DriverManager.getDriver() == null)
			try {
				new Driver();
			} catch (Exception e) {

			}

	}

}
