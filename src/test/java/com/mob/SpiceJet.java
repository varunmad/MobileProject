package com.mob;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SpiceJet {
	static AndroidDriver<MobileElement>driver;
	public static void scrollDown() {
		Dimension size = driver.manage().window().getSize();
		Double startHt=	size.getHeight()*0.8;
		int s=startHt.intValue();
		Double endHt=	size.getHeight()*0.2;
		int e=endHt.intValue();
			
			
			TouchAction acc=new TouchAction(driver);
			acc.press(PointOption.point(0, s)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(PointOption.point(0, e)).release().perform();
			}
			public static List<MobileElement> getLoc() {
				 return driver.findElements(By.xpath("//*[@text='10'][1]"));
				
			
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
		c.setCapability("appPackage", "com.vl.spicejet");
		c.setCapability("appActivity", "com.vl.spicejet.MainActivity");
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), c);
	Thread.sleep(7000);
	MobileElement navigate = driver.findElement(By.xpath("//*[@text='ALLOW ALL THE TIME']"));
	navigate.click();
//	Thread.sleep(3000);
//	MobileElement depart = driver.findElement(By.id("//*[@text='MAA']"));
//	depart.click();
//	Thread.sleep(3000);
//	MobileElement dcity = driver.findElement(By.id("//*[@text='BLR - Bengaluru, India']"));
//	dcity.click();
	MobileElement arrive = driver.findElement(By.xpath("//*[@text='To']"));
	arrive.click();
	Thread.sleep(3000);
	MobileElement acity = driver.findElement(By.xpath("//*[@text='BLR - Bengaluru, India']"));
	acity.click();
	Thread.sleep(3000);
	MobileElement date = driver.findElement(By.xpath("//*[@text='Tue, 5 May']"));
	date.sendKeys("9 June");
	Thread.sleep(3000);
	scrollTillLoad();
	Thread.sleep(3000);
	
	//List<MobileElement> arrival = driver.findElements(By.xpath("//div[@class='_highlighter-box_619e8 _inspected-element-box_619e8']"));
	
	
	
//	Thread.sleep(5000);
	MobileElement search = driver.findElement(By.xpath("//*[@text='Search Flights']"));
	search.click();
	Thread.sleep(3000);
//	
}
}