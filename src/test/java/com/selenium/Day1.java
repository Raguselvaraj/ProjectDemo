package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	}

}
