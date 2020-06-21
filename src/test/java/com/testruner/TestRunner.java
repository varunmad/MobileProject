package com.testruner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVM;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(features= {"src\\test\\resources"},glue= {"com.stepdefinition"},dryRun=false,monochrome=true,plugin= {"json:src\\test\\resources\\Reporting\\out.json"})
public class TestRunner {
	@AfterClass
	public static void afterClass() {
		JVM.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reporting\\cucumber.json");

}

}