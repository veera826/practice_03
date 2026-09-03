package com.veera.vara;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Working_with_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		
		
	WebElement abc=	driver.findElement(By.xpath("//*[contains(text(),'test confirm')]"));
	
	abc.click();
	
	Alert al=driver.switchTo().alert();
	
    String actual=al.getText();

    String expected="Are you sure?";

    Assert.assertEquals(actual, expected);


	
	
		
		

		

	}

}
