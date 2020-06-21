package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVM {
	public static void generateJVMReport(String jsonFile) {
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reporting");
		Configuration con = new Configuration(loc, "Adactin automation");
		con.addClassifications("AppName", "Adactin");
		con.addClassifications("PlatforName", "Android");
		con.addClassifications("PlatforVersion", "10");
		con.addClassifications("BuildNO", "3423");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, con);
		builder.generateReports();
	}
}
