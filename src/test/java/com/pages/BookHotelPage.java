package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		@AndroidFindBy(id="first_name")
		private MobileElement txtFirstName;
		@AndroidFindBy(id="last_name")
		private MobileElement txtLastName;
		@AndroidFindBy(id="address")
		private MobileElement adress;
		@AndroidFindBy(id="cc_num")
		private MobileElement cardNo;
		@AndroidFindBy(id="cc_type")
		private MobileElement cardTyp;
		@AndroidFindBy(id="cc_exp_month")
		private MobileElement cardMonth;
		@AndroidFindBy(id="cc_exp_year")
		private MobileElement cardYear;
		@AndroidFindBy(id="cc_cvv")
		private MobileElement cvv;

		@AndroidFindBy(id="book_now")
		private MobileElement btnBook;

		public MobileElement getCardTyp() {
			return cardTyp;
		}
		public MobileElement getCardMonth() {
			return cardMonth;
		}
		public MobileElement getCardYear() {
			return cardYear;
		}
		public MobileElement getCvv() {
			return cvv;
		}
		





		public MobileElement getBtnBook() {
			return btnBook;
		}
		public MobileElement getTxtFirstName() {
			return txtFirstName;
		}
		public MobileElement getTxtLastName() {
			return txtLastName;
		}
		public MobileElement getAdress() {
			return adress;
		}
		public MobileElement getCardNo() {
			return cardNo;
		}

}
