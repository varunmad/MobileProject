package com.stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


import com.base.BaseClass;
import com.pages.*;

import cucumber.api.java.en.*;
import io.appium.java_client.MobileElement;

public class Stepdefinition extends BaseClass{
	LoginPage logPage;
	SearchHotelPage searchPage;
	SelectHotelPage selectPage;
	BookHotelPage BookPage;
	ConfirmationPage conformPage;
	@Given("User is on adactin page")
	public void user_is_on_adactin_page() {
		
	}
	

	@When("User enters {string} and {string}")
	public void user_enters_and(String s1, String s2) {
		logPage = new LoginPage();
		type(logPage.getTextUserName(), s1);
		MobileElement pass = logPage.getTextpassword();
		type(pass, s2);
		
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		btnclick(logPage.getBtnlogin());
	}

	@When("User should select the  {string},{string},{string},{string}")
	public void user_should_select_the(String loc, String h, String romtyp, String nor) {
		searchPage=new SearchHotelPage();
		MobileElement local = searchPage.getLoc();
		selectByAttribute(local,loc);
		MobileElement hotel = searchPage.getHotel();
		selectByAttribute(hotel, h);
		MobileElement room = searchPage.getRomTyp();
	selectByAttribute(room, romtyp);

	MobileElement num = searchPage.getRomNum();
		type(num, nor);
		
	}

	@When("User should enter the check in   {string},{string}")
	public void user_should_enter_the_check_in(String din, String dout) {
		MobileElement datein = searchPage.getDin();
		datein.sendKeys(din);

		MobileElement dateout = searchPage.getDout();
		dateout.sendKeys(dout);
	}

	@When("User should select the room  {string}, {string}")
	public void user_should_select_the_room(String adult, String child) {
		
		MobileElement adultno = searchPage.getAdultRom();
		type(adultno, adult);
		MobileElement childno =searchPage.getChildRom();
		type(childno, child);
	}

	@When("User should click the search")
	public void user_should_click_the_search() {
		btnclick(searchPage.getBtnSubmit());
		
	}

	@When("User should select the hotel name")
	public void user_should_select_the_hotel_name() {
		selectPage=new SelectHotelPage();
		btnclick(selectPage.getRadiobtn());
	}

	@When("User should click continue")
	public void user_should_click_continue() {
		MobileElement continuebtn = driver.findElement(By.id("continue"));
		btnclick(continuebtn);
	}

	@When("User should enter the name  {string},{string},{string},{string}")
	public void user_should_enter_the_name(String fn, String ln, String ba, String can) {
		MobileElement firstName = BookPage.getTxtFirstName();
		type(firstName, fn);
		MobileElement lastName = BookPage.getTxtLastName();
		type(lastName, ln);
		MobileElement billing = BookPage.getAdress();
		type(billing, ba);
		MobileElement cardno = BookPage.getCardNo();
		type(cardno, can);
	
	}

	@When("User should select the cc {string},{string},{string}")
	public void user_should_select_the_cc(String cardtype, String expMonth, String expYear) {
		MobileElement cart = BookPage.getCardTyp();
		type(cart, cardtype);
		MobileElement expm = BookPage.getCardMonth();
		type(expm, expMonth);
		MobileElement expy = BookPage.getCardYear();
		type(expy,expYear);
	}

	@When("User should enter the ccv {string}")
	public void user_should_enter_the_ccv(String cvv) {
		MobileElement cv =BookPage.getCvv();
		type(cv, cvv);
	}

	@When("User should click the book buton")
	public void user_should_click_the_book_buton() {
		btnclick(BookPage.getBtnBook());
	}

	@Then("User should generate the order id")
	public void user_should_generate_the_order_id() {
		MobileElement order = driver.findElement(By.id("order_no"));
		String orderid = order.getAttribute("value");
		System.out.println();
		System.out.println("Order ID : " + orderid);
		MobileElement myIti=conformPage.getMyItinerary();
		btnclick(myIti);
		MobileElement btnorder = driver.findElement(By.xpath("//input[@value='"+orderid+"']/parent::td/preceding-sibling::td"));
	btnorder.click();
	MobileElement cancel = driver.findElement(By.xpath("//input[@value='Cancel Selected']"));
	cancel.click();
	
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	
}
}