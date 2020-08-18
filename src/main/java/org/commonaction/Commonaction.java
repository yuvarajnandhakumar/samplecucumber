package org.commonaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonaction {
	public static WebDriver driver;

	
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			}
	
	public void inserttext(WebElement ele, String Value)
	{
		ele.sendKeys(Value);
	}
	
	public void submit(WebElement ele)
	{
		ele.click();
	}
	
	public void waittime() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	

}
