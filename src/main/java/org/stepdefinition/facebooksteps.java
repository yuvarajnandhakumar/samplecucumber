package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.Locators.fbLocators;
import org.commonaction.Commonaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebooksteps extends Commonaction{

	fbLocators fb = new fbLocators();
	Commonaction ca = new Commonaction();


	@Given("Launching chrome browser")
	public void launching_chrome_browser() {
		launch();
		System.out.println("chrome launched");
	}

	@When("User enters in fb url")
	public void user_enters_in_fb_url() {
		driver.get("http://fb.com");

	}

	@Then("user Enters username")
	public void user_Enters_username(DataTable onedimL) throws InterruptedException {
		List<String> oneD = onedimL.asList();
		fb.getUsername().sendKeys(oneD.get(1));   
		Thread.sleep(1000);

	}



	@And("user Enters pwd")
	public void user_Enters_pwd(DataTable TwoDimL) throws InterruptedException {
		List<List<String>> TwoDList = TwoDimL.asLists();
		fb.getPwd().sendKeys(TwoDList.get(1).get(0)); 
		Thread.sleep(1000);
	}

	/*@Then("user Enters username")
	public void user_Enters_username(DataTable oneDmap) throws InterruptedException {
		Map<String, String> OneDM = oneDmap.asMap(String.class, String.class);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(OneDM.get("uname"));   
		Thread.sleep(1000);

	}



	@And("user Enters pwd")
	public void user_Enters_pwd(DataTable TwoDmap) throws InterruptedException {
		List<Map<String, String>> TwoDimMap = TwoDmap.asMaps();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(TwoDimMap.get(1).get("Pwd")); 
		Thread.sleep(1000);
	}*/

	@Then("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("login button clicked");
		//driver.quit();
	}


	@When("User enters in fb {string}")
	public void user_enters_in_fb(String fblink) {
		driver.get(fblink); 
	}

	@Then("user Enters {string}")
	public void user_Enters(String uname) throws InterruptedException {
		ca.inserttext(fb.getUsername(), uname);
		ca.waittime();
	}

	@And("user Enter {string}")
	public void user_Enter(String pswd) throws InterruptedException {
		ca.inserttext(fb.getPwd(),pswd); 
		ca.wait();
	}

	@Given("user enter username from {string}")
	public void user_enter_username_from(String string) throws InterruptedException {
		ca.inserttext(fb.getUsername(), "yuvraj");
		ca.waittime();
	}
}
