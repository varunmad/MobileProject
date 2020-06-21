package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);}
		@AndroidFindBy(id="location")
		private MobileElement loc;
		@AndroidFindBy(id="hotels")
		private MobileElement hotel;
		@AndroidFindBy(id="room_type")
		private MobileElement romTyp;
		@AndroidFindBy(id="room_nos")
		private MobileElement romNum;
		@AndroidFindBy(xpath="//input[@name='datepick_in']")
		private MobileElement din;
		@AndroidFindBy(xpath="//input[@name='datepick_out']")
		private MobileElement dout;
		@AndroidFindBy(id="adult_room")
		private MobileElement adultRom;
		@AndroidFindBy(id="child_room")
		private MobileElement childRom;
		@AndroidFindBy(id="Submit")
		private MobileElement btnSubmit;
		public MobileElement getLoc() {
			return loc;
		}
		public MobileElement getHotel() {
			return hotel;
		}
		public MobileElement getRomTyp() {
			return romTyp;
		}
		public MobileElement getRomNum() {
			return romNum;
		}
		public MobileElement getDin() {
			return din;
		}
		public MobileElement getDout() {
			return dout;
		}
		public MobileElement getAdultRom() {
			return adultRom;
		}
		public MobileElement getChildRom() {
			return childRom;
		}
		public MobileElement getBtnSubmit() {
			return btnSubmit;
		}
}
