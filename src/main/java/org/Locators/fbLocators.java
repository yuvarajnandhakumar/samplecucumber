package org.Locators;

import java.util.List;

import org.commonaction.Commonaction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class fbLocators extends Commonaction{


	public fbLocators() 
	{	
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;

	@FindBy(id="email") 
	private WebElement username;

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getUsername() {
		return username;
	}

	

}
