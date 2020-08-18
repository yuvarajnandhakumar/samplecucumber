package org.stepdefinition;

import org.commonaction.Commonaction;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends Commonaction{
	//Commonaction ca= new Commonaction();
	
	@Before
	public void beforescenario()
	{
		launch();
		System.out.println("before hooks");
	}
	
	@After
	public void afterscenario()
	{
		driver.quit();
		System.out.println("after scenarios");
	}
	
	
	
	
	

}
