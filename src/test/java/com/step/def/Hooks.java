package com.step.def;

import com.base.TestBase;
import com.util.CommonFunction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase{

	
	@Before
	public void SetUp() {
		Hooks hook=new Hooks();
		hook.IntilizDriver();
		String url=CommonFunction.ReadPropertyFile("url");
		driver.get(url);
	
		
	}
	
	
	
	
	
	
	
	@After
	public void teardown() {
		//driver.quit();
		
	}
}
