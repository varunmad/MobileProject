package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);}
		@AndroidFindBy(id="radiobutton_0")
		private MobileElement radiobtn;
		public MobileElement getRadiobtn() {
			return radiobtn;
		}
}
