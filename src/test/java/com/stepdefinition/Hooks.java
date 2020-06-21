package com.stepdefinition;



import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
@Before
public void beforeScenario() throws MalformedURLException {
   getDriver();
}
@After
public void afterScenario(Scenario sc) {
TakesScreenshot ts=(TakesScreenshot) driver;
byte[] b=ts.getScreenshotAs(OutputType.BYTES);
sc.embed(b, "image/pang");
}
}
