package com.mob;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class UnitedLines {
	static AndroidDriver<MobileElement>driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability("deviceName", "OnePlus6");
		c.setCapability("platformName", "Android");
		c.setCapability("platformVersion", "10");
		c.setCapability("appPackage", "com.united.mobile.android");
		c.setCapability("appActivity", "com.united.mobile.android.Main");
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), c);
	Thread.sleep(5000);
	MobileElement navigate = driver.findElement(By.id("homescreen_Onboarding_tv_skipAll"));
	navigate.click();
	Thread.sleep(3000);
	MobileElement guest = driver.findElement(By.id("tv_continueGuest_homescreen"));
	guest.click();
	Thread.sleep(3000);
	MobileElement trip = driver.findElement(By.id("book_tv"));
	trip.click();
	MobileElement dcity = driver.findElement(By.id("commonDepartureAirportButton"));
	dcity.click();
	Thread.sleep(3000);
	MobileElement fromselect = driver.findElement(By.id("AirportSearch_EditText01"));
	fromselect.sendKeys("chennai",Keys.ENTER);
	Thread.sleep(3000);
//	MobileElement trip = driver.findElement(By.id("book_tv"));
//	trip.click();
//	MobileElement dcity = driver.findElement(By.id("commonDepartureAirportButton"));
//	dcity.click();
}
}