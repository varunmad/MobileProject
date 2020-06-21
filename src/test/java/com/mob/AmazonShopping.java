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

public class AmazonShopping {
	
static AndroidDriver<MobileElement>driver;
	public static void scrollDown() {
Dimension size = driver.manage().window().getSize();
Double startHt=	size.getHeight()*0.5;
int s=startHt.intValue();
Double endHt=	size.getHeight()*0.1;
int e=endHt.intValue();
	
	
	TouchAction acc=new TouchAction(driver);
	acc.press(PointOption.point(0, s)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(PointOption.point(0, e)).release().perform();
	}
	public static List<MobileElement> getLoc() {
		return driver.findElements(By.className("//android.widget.EditText[@index='1']"));
			}
	
	
	public static void scrollTillLoad() {
while(getLoc().size()==0) {
	scrollDown();
}
if(getLoc().size()!=0) {
	getLoc().get(0).sendKeys("Wirless charger is available");
}
	}
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability("deviceName", "OnePlus6");
		c.setCapability("platformName", "Android");
		c.setCapability("platformVersion", "10");
		c.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		c.setCapability("appActivity", "com.amazon.mShop.search.SearchActivity");
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), c);
	Thread.sleep(5000);
	MobileElement item = driver.findElement(By.id("action_bar_burger_icon"));
	item.click();
	Thread.sleep(3000);
	MobileElement category = driver.findElement(By.xpath("//*[@text='Shop by Category']"));
	category.click();
	Thread.sleep(3000);
	MobileElement product = driver.findElement(By.xpath("//*[@text='Mobiles, Computers']"));
	product.click();
	MobileElement mob = driver.findElement(By.xpath("//*[@text='Mobiles']"));
	mob.click();
	Thread.sleep(3000);
	
	
	MobileElement search = driver.findElement(By.xpath("//*[@text='Samsung m31']"));
	search.click();
	scrollTillLoad();
//	Thread.sleep(5000);
//	MobileElement searchp = driver.findElement(By.id("ap_email_login"));
//	searchp.sendKeys("9600183978",Keys.ENTER);
	
	
	
	
	
//	MobileElement search = driver.findElement(By.id("rs_search_src_text"));
//	search.sendKeys("oneplus7",Keys.ENTER);
//	Thread.sleep(5000);
//	MobileElement onep = driver.findElement(By.xpath("//*[@text='OnePlus 7 (Mirror Grey, 6GB RAM, Optic AMOLED Display, 128GB Storage, 3700mAH Battery)']"));
//	onep.click();
//	Thread.sleep(3000);
//	MobileElement pin = driver.findElement(By.id("loc_ux_gps_enter_pincode"));
//	pin.click();
//	MobileElement code = driver.findElement(By.id("loc_ux_update_pin_code"));
//	code.click();
//	Thread.sleep(3000);
//	MobileElement pin = driver.findElement(By.id("loc_ux_gps_enter_pincode"));
//	pin.sendKeys("oneplus7");;
//	
}
}