package com.mob;

import java.awt.Robot;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Product {
	static AndroidDriver<MobileElement>driver;


	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability("deviceName", "OnePlus6");
		c.setCapability("platformName", "Android");
		c.setCapability("platformVersion", "10");
		c.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		c.setCapability("appActivity", "com.amazon.mShop.search.SearchActivity");
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), c);
	Thread.sleep(5000);
	MobileElement select = driver.findElement(By.id("action_bar_burger_icon"));
	select.click();
	
	MobileElement item = driver.findElement(By.xpath("//*[@text='Home']"));
	item.click();
	Thread.sleep(5000);
	MobileElement wel = driver.findElement(By.xpath("//*[@text='Already a customer? Sign in']"));
	wel.click();
	Thread.sleep(3000);
	MobileElement cus = driver.findElement(By.id("login_accordion_header"));
	cus.click();
	Thread.sleep(5000);
	
	
	
 driver.findElement(By.id("ap_email_login")).sendKeys("sathishsa77@gmail.com");
	Thread.sleep(5000);
	
	
				Thread.sleep(3000);
				MobileElement con = driver.findElement(By.xpath("//*[@text='Continue']"));
				Thread.sleep(5000);
				con.sendKeys("sathishsa77@gmail.com");
	MobileElement pass = driver.findElement(By.id("ap_password"));
	Thread.sleep(5000);
	pass.sendKeys("9600183978610923923",Keys.ENTER);
	Thread.sleep(3000);
	MobileElement login = driver.findElement(By.id("signInSubmit"));
	login.click();
	Thread.sleep(3000);
	
	MobileElement category = driver.findElement(By.xpath("//*[@text='Search']"));
	category.click();
	Thread.sleep(3000);
	MobileElement product = driver.findElement(By.xpath("//*[@text='Coca Cola 300ml (Pack of 6)']"));
	product.click();
//	MobileElement mob = driver.findElement(By.xpath("//*[@text='Mobiles']"));
//	mob.click();
//	Thread.sleep(3000);
//
	}
}
