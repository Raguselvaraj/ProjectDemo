package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*QUESTION 1
		----------
		URL : https://www.facebook.com/ 

		NOTE: Enter Email or Phone and Password.*/
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Ragu");
        
        WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Selvaraj");
	
	    driver.close();*/
	    
		
		/*QUESTION 2
		----------
		URL : https://www.redbus.in/ 

		NOTE: Enter from and to textbox.*/
	    
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.id("src"));
	    src.sendKeys("Chennai");
	    
	    WebElement dest = driver.findElement(By.id("dest"));
	    dest.sendKeys("coimbatore");
	    
	    driver.close();*/
		
		/*QUESTION 3
		----------
		URL : https://www.google.com/

		NOTE: Enter GreensTechnology.*/ 
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.id("inputWrapper"));
	    text.sendKeys("Greens technology");
	 
	    driver.close();*/
	
		/*QUESTION 4
		----------
		URL : https://infinity.icicibank.com/corp/Login.jsp

		NOTE: Enter username and password.*/ 
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("DUMMY1"));
		username.sendKeys("hiii");
		
		WebElement password = driver.findElement(By.id("DUMMY23"));
	    password.sendKeys("selvaraj");
	
	    driver.close();*/
		
		/*QUESTION 5
		----------
		URL : https://netbanking.hdfcbank.com/ 

		NOTE: Enter customer id .*/
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement userId = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		userId.sendKeys("raguselvaraj");
		
		driver.close();*/
		
		
	
	}

}
