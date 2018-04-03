package welcome;

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
		
		WebDriver webDriver = myPageRef.getDriverHandle("file:///D:/SG/task2dwp/WebContent/Index.html");
		
		//Browser Commands
		System.out.println("Title was "+webDriver.getTitle());
		System.out.println("CurrentURL was "+webDriver.getCurrentUrl());
		System.out.println("PageSource was "+webDriver.getPageSource());
		
	
		WebElement element1 = webDriver.findElement(By.name("username"));

		element1.sendKeys("jegasuguna");

		WebElement element2 = webDriver.findElement(By.name("psw"));

		element2.sendKeys("Suguna1@");
			WebElement searchButton= webDriver.findElement(By.xpath("/html/body/form/button"));
		//*[@id="nav-search"]/form/div[2]/div/input
		//Click on the searchBox
		searchButton.submit();


	
		
	}
	
}
