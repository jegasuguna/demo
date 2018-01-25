package com.automation.google;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LandingPage {

	WebDriver pageUnderTest = null;
	
	
	public  WebDriver getDriverHandle(String stringWebSiteURL)
	{
		String exePath = "D://chromedriver//chromedriver.exe";
		ChromeDriverService.Builder serviceBuilder = new 

ChromeDriverService.Builder();
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		serviceBuilder.withLogFile(new File("D://logs//logFile.txt"));
		driver.get(stringWebSiteURL);
		this.pageUnderTest=driver;
		
		return driver;
	
	}
	
	
	public static void main(String args[]) throws InterruptedException
	{
		LandingPage myPageRef = new LandingPage();
		
		WebDriver webDriver = myPageRef.getDriverHandle("https://www.google.com/");
		
		//Browser Commands
		System.out.println("Title was "+webDriver.getTitle());
		System.out.println("CurrentURL was "+webDriver.getCurrentUrl());
		//System.out.println("PageSource was "+webDriver.getPageSource());
		
	
	
		
		WebElement searchBox= webDriver.findElement(By.name("q"));
		//Click on the searchBox
		searchBox.click();
		searchBox.sendKeys("Selenium");
		
			WebElement searchButton= webDriver.findElement(By.name("btnK"));
		//*[@id="nav-search"]/form/div[2]/div/input
		//Click on the searchBox
		searchButton.submit();

		Thread.sleep(30);
		webDriver.navigate().back();
	
		
	}
	//*[@id="nav-search"]/form/div[2]/div/input
	//*[@id="lst-ib"]
}
