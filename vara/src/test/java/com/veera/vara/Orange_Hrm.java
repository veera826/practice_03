package com.veera.vara;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange_Hrm {
	
	WebDriver driver;
	
	@Test(description = "Verify login with valid username and password",enabled = true,priority = 0)
	
	public void login() throws Throwable {
		
		
	driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	
	
	Orange_Hrm_Window_Elements or=new Orange_Hrm_Window_Elements(driver);
	
	Thread.sleep(2000);
	
	
	or.enterusername("Admin");
	
	or.enterPassword("admin123");
	
	or.enterClick();
	

		
	}
	

}
