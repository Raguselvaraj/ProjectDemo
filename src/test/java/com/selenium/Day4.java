package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
/*		
		QUESTION 11
		-----------
		URL : https://www.flipkart.com/ 

		NOTE: Click login and enter User name password
		      Print the details you are given.

		QUESTION 12
		-----------
		URL : https://www.shopclues.com/wholesale.html 

		NOTE: Search any product and click 1st product*/

		/*QUESTION 6
		----------
		URL : https://www.facebook.com/ 

		NOTE: Print the email and password which was entered by user */

		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Ragu");
		
		String attribute = email.getAttribute("value");
		System.out.println(attribute);
		
		WebElement pass = driver.findElement(By.id("pass"));
        pass.clear();
        pass.sendKeys("Ragu selvaraj");
        
        String attribute2 = pass.getAttribute("value");
        System.out.println(attribute2);
        
        Thread.sleep(5000);
        
        driver.close();*/
	
		/*QUESTION  8
		------------
		URL : http://adactinhotelapp.com/

		NOTE: Print the UserName and Password that you are entered.*/
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Ragu");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ragu selvaraj");
		
		Thread.sleep(3000);

		WebElement login = driver.findElement(By.id("login"));
		login.click();
		driver.close();*/
		
		/*QUESTION 9
		-----------
		URL : https://www.snapdeal.com/ 

		NOTE: Search any product and click 1st product*/
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("blackberry",Keys.ENTER);
		
		Thread.sleep(5000);
		WebElement blackberry = driver.findElement(By.xpath("//p[contains(text(),'Blackberry Passport')]"));
		blackberry.click();
		
		Thread.sleep(5000);*/
		
		/*QUESTION 10
		-----------
		URL : https://www.flipkart.com/ 

		NOTE: Search any product and click 1st product*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		WebElement search = driver.findElement(By.name("q"));
	    search.sendKeys("samsung mobiles",Keys.ENTER);
	    
	    WebElement galaxy = driver.findElement(By.xpath("(//div[contains(text(),'Fusion Blue, 64 GB')])"));
	    galaxy.click();
	
	    Thread.sleep(3000);
	    driver.close();
	    
	    
	}

}
