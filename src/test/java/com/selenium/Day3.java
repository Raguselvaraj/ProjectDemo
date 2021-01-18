package com.selenium;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
	

public class Day3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*QUESTION 1
		-----------
		URL : https://www.amazon.in/

		NOTE: Click start here. Enter iphone and search
*/
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
			
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Iphone",Keys.ENTER);
	
	    driver.close();*/
	
		
		/*QUESTION 2
		-----------
		URL : https://www.facebook.com/

		NOTE: Enter email and password and click login(by using xpath locator).*/
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Ragu");
		
		WebElement pass = driver.findElement(By.id("pass"));
        pass.clear();
        pass.sendKeys("Ragu selvaraj");
        
        Thread.sleep(5000);
        
        driver.close();*/
		
		/*QUESTION 3
		-----------
		URL : http://demo.automationtesting.in/Register.html

		NOTE: Give details and register the form.*/
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		firstName.sendKeys("Ragu");
		
		WebElement lastName = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		lastName.sendKeys("Selvaraj");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
		address.sendKeys("Anna Nagar,Chennai");
	
	    WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
	    email.sendKeys("raguashwin851@gmail.com");
	    
	    WebElement phone = driver.findElement(By.xpath("//input[@type=\"tel\"]"));
	    phone.sendKeys("456372327");
	    
	    WebElement male = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
	    male.click();
	    
	    WebElement cricket = driver.findElement(By.id("checkbox1"));
	    cricket.click();
	    
	    WebElement movies = driver.findElement(By.id("checkbox2"));
	    movies.click();
	    
	   // WebElement language = driver.findElement(By.xpath("//div[@id=\"msdd\"]"));
	    //language.sendKeys("Tamil,English");
	    
	    WebElement skills = driver.findElement(By.xpath("(//select[@type=\"text\"])[1]"));
	    Select s=new Select(skills);
	    s.selectByVisibleText("Java");
	    
	    WebElement country = driver.findElement(By.id("countries"));
	    Select se=new Select(country);
	    se.selectByVisibleText("India");
	    
        WebElement firstpassword = driver.findElement(By.id("firstpassword"));	    
	    firstpassword.sendKeys("ragu selvaraj");
	   
	    WebElement confirmpassword = driver.findElement(By.id("firstpassword"));	    
	    confirmpassword.sendKeys("ragu selvaraj");
	    
	    Thread.sleep(5000);
	    
	    driver.close();*/
		
		/*QUESTION 5
		-----------
		URL : http://greenstech.in/selenium-course-content.html

		NOTE: Click interview question +.
		      Click cts  interview question*/
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		
		WebElement interview = driver.findElement(By.id("heading20"));
        ac.click(interview).perform();
	
        WebElement cts = driver.findElement(By.xpath("//a[contains(text(),'CTS')]"));
	    cts.click();*/
	    
		/*QUESTION 6
		----------
		URL : https://www.redbus.in/

		NOTE: Click ^[opposite of this] and  signin/signup 
		      Enter Mobilenumber and click Generate OTP*/
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement arrow = driver.findElement(By.id("signin-block"));
		arrow.click();
		
		WebElement signIn = driver.findElement(By.id("signInLink"));
		signIn.click();
		
		Thread.sleep(10000);
		
		WebElement mobile = driver.findElement(By.id("mobileNoInp"));
        mobile.sendKeys("9994292250");
        
        WebElement robot = driver.findElement(By.xpath("(//div[@class=\"recaptcha-checkbox-border\"])[1]"));
	    robot.click();*/
	
	    /*QUESTION 7
		----------
		URL : https://www.cleartrip.com/trains

		NOTE: Enter From ,TO  and click search trains*/
	    
	    /*System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		WebElement fromstation = driver.findElement(By.id("from_station"));
	    fromstation.sendKeys("CHennai");
	    
	    WebElement tostation = driver.findElement(By.id("to_station"));
	    tostation.sendKeys("Bangalore");
	    
	    WebElement search = driver.findElement(By.id("trainFormButton"));
	    search.click();
	    
	    Thread.sleep(4000);
	    
	    driver.close();*/
	    
	}

}
