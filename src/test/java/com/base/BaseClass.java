package com.base;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public static AndroidDriver<MobileElement> driver;

	public void getDriver() throws MalformedURLException {
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability("deviceName", "OnePlus6");
		c.setCapability("platformName", "Android");
		c.setCapability("platformVersion", "10");
		c.setCapability("appPackage", "com.adactin.education.hotelbooking");
		c.setCapability("appActivity", "com.adactin.education.hotelbooking.MainActivity");
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), c);
	}

	public void loadUrl(String url) {
		driver.get(url);
	}
	public void btnclick(MobileElement element) {
element.click();
	}

	public void type(MobileElement element, String name) {
		element.sendKeys(name);
	}

	public void selectTextBIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}

	public void selectByAttribute(WebElement element, String name) {
		new Select(element).selectByValue(name);
	
	}

	public void typejs(WebElement element, String name) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].setAttribute('value','" + name + "')", element);
		
	}

	public String generateRandomDate() {
		return new SimpleDateFormat("EEE_MMM_dd_yyyy_hhmmss").format(new Date());
	}

	public String getTextByAttribute(WebElement element) {
		return element.getAttribute("value");
	}

	public String getTitle() {
		return driver.getTitle();
	}


}
