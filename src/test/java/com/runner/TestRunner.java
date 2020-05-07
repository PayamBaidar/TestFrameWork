package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = { 
				"pretty:STDOUT", "html:Reports.cucumber-pretty",
		},
		
//		monochrome = true,
		
//		tags = "@smoke",
//		tags = "@regression",
		
		features = {
				"src\\test\\resurces\\features\\login_automation.feature",
				
//				"src\\test\\resurces\\features\\Order.feature"
		
		}, glue = "com\\step\\def"
				
//				dryRun = false
				
		)
		



public class TestRunner {

}
