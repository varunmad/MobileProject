package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BaseClass {
	
public LoginPage() {
PageFactory.initElements(new AppiumFieldDecorator(driver),this);
}

@AndroidFindBy(id="username")
private MobileElement textUserName;
@AndroidFindBy(id="password")
private MobileElement textpassword;
@AndroidFindBy(id="login")
private MobileElement btnlogin;


public MobileElement getBtnlogin() {
	return btnlogin;
}
public MobileElement getTextUserName() {
	return textUserName;
}
public MobileElement getTextpassword() {
	return textpassword;
}

}
