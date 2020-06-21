package com.mob;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class snap {
	static AndroidDriver<MobileElement>driver;
	public static void scrollDown() {
		Dimension size = driver.manage().window().getSize();
		Double startHt=	size.getHeight()*0.6;
		int s=startHt.intValue();
		Double endHt=	size.getHeight()*0.1;
		int e=endHt.intValue();
			
			
			TouchAction acc=new TouchAction(driver);
			acc.press(PointOption.point(0, s)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(PointOption.point(0, e)).release().perform();
			}
			public static List<MobileElement> getLoc() {
				return driver.findElements(By.xpath("//*[@text='Bionova Hand Sanitizer 500 mL Pack of 1']"));
					}
			
			
			public static void scrollTillLoad() {
		while(getLoc().size()==0) {
			scrollDown();
		}
		if(getLoc().size()!=0) {
			getLoc().get(0).click();
		}
			}

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability("deviceName", "OnePlus6");
		c.setCapability("platformName", "Android");
		c.setCapability("platformVersion", "10");
		c.setCapability("appPackage", "com.snapdeal.main");
		c.setCapability("appActivity", "com.snapdeal.ui.material.activity.MaterialMainActivityDefault");
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), c);
	Thread.sleep(5000);
	MobileElement select = driver.findElement(By.xpath("//*[@text='English']"));
	select.click();
		MobileElement item = driver.findElement(By.id("cta"));
	item.click();
	Thread.sleep(5000);
	scrollTillLoad();
	Thread.sleep(5000);
	MobileElement wel = driver.findElement(By.id("cancelCta"));
	wel.click();
	Thread.sleep(3000);
	MobileElement cus = driver.findElement(By.id("buyButton"));
	cus.click();
	Thread.sleep(5000);
	MobileElement goo = driver.findElement(By.id("google_text"));
	goo.click();
	Thread.sleep(3000);
	MobileElement mail = driver.findElement(By.xpath("//*[@text='ticketshopping15@gmail.com']"));
	mail.click();
	System.out.println("Done");
}
}