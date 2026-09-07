package com.veera.vara;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Orange_Hrm_Window_Elements {
	
	
	
	@FindBy(xpath="//*[contains(@name,'username')]")
	
	private WebElement user;
	
	
	
	@FindBy(xpath="//*[contains(@name,'password')]")
	
	private WebElement pass;
	//*[contains(@name,'password')]
	
	

	@FindBy(xpath="//*[contains(@type,'submit')]")
	
	private WebElement submit;
	
	

	
	
	public Orange_Hrm_Window_Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void enterusername(String user1) {
		
		
	user.sendKeys(user1);
		
	}
	
	public void enterPassword(String pass2) {
		
		pass.sendKeys(pass2);
		
	}
	
	
	public void enterClick() {
		
		submit.click();
		
	}
	
	
	

	
	
	

	
	
	
	

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * 
	 * WebDriver driver=new ChromeDriver();
	 * 
	 * driver.get(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

}
