package com.mob;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AirIndia {
	static AndroidDriver<MobileElement>driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability("deviceName", "OnePlus6");
		c.setCapability("platformName", "Android");
		c.setCapability("platformVersion", "10");
		c.setCapability("appPackage", "com.bets.airindia.ui");
		c.setCapability("appActivity", "aero.developer.itravel.foo.SplashActivity");
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), c);
	Thread.sleep(5000);
	MobileElement bookFlight = driver.findElement(By.className("android.widget.ImageView"));
	bookFlight.click();
	Thread.sleep(3000);
	MobileElement deny = driver.findElement(By.id("btnDeny"));
	deny.click();
	Thread.sleep(3000);
	MobileElement depart = driver.findElement(By.xpath("departure_airport"));
	depart.click();
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
	MobileElement date = driver.findElement(By.xpath("//*[@text='20']"));
	date.click();
	MobileElement sclass = driver.findElement(By.xpath("//*[@text='ECONOMY']"));
	sclass.click();
	Thread.sleep(3000);
	MobileElement contype = driver.findElement(By.id("concession_switch"));
	contype.click();
	Thread.sleep(3000);
	MobileElement student = driver.findElement(By.xpath("//*[@text='Student']"));
	student.click();
	MobileElement numpass = driver.findElement(By.id("set_selected_passengers"));
	numpass.click();
	Thread.sleep(3000);
	MobileElement find = driver.findElement(By.id("find_flights"));
	find.click();
	Thread.sleep(3000);
	MobileElement retdate = driver.findElement(By.xpath("//*[@text='11']"));
	retdate.click();
	MobileElement rmonth = driver.findElement(By.xpath("//*[@text='May 2020']"));
	rmonth.click();
	Thread.sleep(3000);
	MobileElement date = driver.findElement(By.xpath("//*[@text='20']"));
	date.click();
	MobileElement sclass = driver.findElement(By.xpath("//*[@text='ECONOMY']"));
	sclass.click();
	Thread.sleep(3000);
}
}