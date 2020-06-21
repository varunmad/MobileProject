package com.mob;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculat {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities c=new DesiredCapabilities();
	c.setCapability("deviceName", "OnePlus6");
	c.setCapability("platformName", "Android");
	c.setCapability("platformVersion", "10");
	c.setCapability("appPackage", "com.oneplus.calculator");
	c.setCapability("appActivity", "com.oneplus.calculator.Calculator");
AndroidDriver<MobileElement>driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), c);
Thread.sleep(5000);
MobileElement one = driver.findElement(By.id("digit_1"));
one.click();
Thread.sleep(3000);
MobileElement plus = driver.findElement(By.id("op_add"));
plus.click();
Thread.sleep(3000);
MobileElement six = driver.findElement(By.id("digit_6"));
six.click();
Thread.sleep(3000);
MobileElement total = driver.findElement(By.id("eq"));
total.click();
Thread.sleep(3000);
String s = total.getText();
System.out.println("addition:"+ total);
if(s.equals("6")) {
	System.out.println("addition is performed");
}
else {
	{
		System.out.println("not performed");
	}
}
}


}

