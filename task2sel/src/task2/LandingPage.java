package task2;

import java.io.File;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LandingPage {

	WebDriver pageUnderTest = null;
	
	
	public WebDriver getDriverHandle(String stringWebSiteURL)
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
	
	
	public static void main(String args[])
	{
		LandingPage myPageRef = new LandingPage();
		
		WebDriver webDriver = myPageRef.getDriverHandle("https://github.com/login");
		
		//Browser Commands
		System.out.println("Title was "+webDriver.getTitle());
		System.out.println("CurrentURL was "+webDriver.getCurrentUrl());
		//System.out.println("PageSource was "+webDriver.getPageSource());



WebElement element1 = webDriver.findElement(By.name("login"));

element1.sendKeys("jegasuguna");

WebElement element2 = webDriver.findElement(By.name("password"));

element2.sendKeys("Suguna1@");
WebElement searchButton= webDriver.findElement(By.name("commit"));
searchButton.click();
		
webDriver.navigate().to("https://github.com//jegasuguna//demo");
webDriver.findElement(By.xpath("//*//*[@id='js-repo-pjax-container']/div[2]/div[1]/div[5]/details/summary")).click();
webDriver.findElement(By.xpath("//*//*[@id='js-repo-pjax-container']/div[2]/div[1]/div[5]/details/div/div/div[3]/a[2]")).click();
	
	
	}}