package com.veera.vara;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
         
		driver.get("https://www.flipkart.com/");
		
		Actions ac=new Actions(driver);
		
		 ac.moveByOffset(10,10).click().perform();
		

	}

}
