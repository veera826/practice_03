package com.veera.vara;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch_Browser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
         
		driver.get("https://www.flipkart.com/");
		
		Actions ac=new Actions(driver);
		
		ac.moveByOffset(10,10).click().perform();
		 
		 
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 
		  File destfile=new File("./screenshots5/veera"+".png");
		  
		  FileUtils.copyFile(src, destfile);
		  
		  
		  
		 
		 
		

	}

}
