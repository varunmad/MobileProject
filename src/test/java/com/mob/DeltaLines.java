package com.mob;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DeltaLines {
	static AndroidDriver<MobileElement>driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability("deviceName", "OnePlus6");
		c.setCapability("platformName", "Android");
		c.setCapability("platformVersion", "10");
		c.setCapability("appPackage", "com.delta.mobile.android");
		c.setCapability("appActivity", "com.delta.mobile.android.SplashScreen");
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), c);
	Thread.sleep(5000);
	MobileElement navigate = driver.findElement(By.id("Navigate up"));
	navigate.click();
	Thread.sleep(3000);
	MobileElement guest = driver.findElement(By.id("continue_as_guest_login"));
	guest.click();
	Thread.sleep(3000);
	MobileElement trip = driver.findElement(By.id("oneway_tab"));
	trip.click();
	MobileElement dcity = driver.findElement(By.xpath("//*[@text='Mumbai']"));
	dcity.click();
	Thread.sleep(3000);
	MobileElement arrive = driver.findElement(By.xpath("//*[@text='Select Destination City']"));
	arrive.click();
	MobileElement acity = driver.findElement(By.xpath("//*[@text='Abu Dhabi']"));
	acity.click();
	Thread.sleep(3000);
	MobileElement bdate = driver.findElement(By.xpath("//*[@text='01']"));
	bdate.click();
	MobileElement month = driver.findElement(By.xpath("//*[@text='May 2020']"));
	month.click();
	Thread.sleep(3000);
	MobileElement adate = driver.findElement(By.xpath("//*[@text='7']"));
	adate.click();
	Thread.sleep(3000);
	MobileElement retdate = driver.findElement(By.xpath("//*[@text='11']"));
	retdate.click();
	MobileElement rmonth = driver.findElement(By.xpath("//*[@text='May 2020']"));
	rmonth.click();
	Thread.sleep(3000);
}
}