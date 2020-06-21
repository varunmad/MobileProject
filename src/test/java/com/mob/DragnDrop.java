package com.mob;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class DragnDrop {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities c=new DesiredCapabilities();
	c.setCapability("deviceName", "OnePlus6");
	c.setCapability("platformName", "Android");
	c.setCapability("platformVersion", "10");
	c.setCapability("appPackage", "dragdrop.stufflex.com.dragdrop");
	c.setCapability("appActivity", "dragdrop.stufflex.com.dragdrop.splash");
AndroidDriver<MobileElement>driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), c);
Thread.sleep(5000);
MobileElement item = driver.findElement(By.id("btn_world_capitals"));
item.click();
Thread.sleep(3000);
MobileElement drag = driver.findElement(By.id("chooseB"));
drag.click();
Thread.sleep(3000);
MobileElement drop = driver.findElement(By.id("answer"));
drop.click();

TouchAction t =new TouchAction(driver);
t.longPress(ElementOption.element(drag)).moveTo(ElementOption.element(drop)).release().perform();
Thread.sleep(3000);
String ans = drop.getText();
System.out.println(ans);
}
}
