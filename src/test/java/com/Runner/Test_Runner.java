package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Shan Smart\\eclipse-workspace1\\LimeRoad1IPT\\src\\test\\java\\com\\feature\\limeroad.feature" ,
				glue = "com.stepdefinition",
				monochrome = true,
				dryRun = false,
				strict = true,
				tags = "@smoketest",
				plugin = {"pretty",
						"html:Resources/limeroad.html",
						"json:Resources/limeroad.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class Test_Runner extends BaseClass {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void browserlaunch() {
		driver = launchBrowser("chrome");
		
	}

}
