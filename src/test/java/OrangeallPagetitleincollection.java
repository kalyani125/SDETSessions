/*//Question10-Collect all page title of Orange application and store themm in a 
collection(Stringdatatype) and print the same*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Examples.TestData;

public class OrangeallPagetitleincollection extends SeleniumTest{
	

	TestData data=new TestData();
	@BeforeTest
	void beforeTest() throws IOException
	{
		File file=new File("data.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
				
		data.setUrl(prop.getProperty("url"));
		data.setUsername(prop.getProperty("Username"));
		data.setPassword(prop.getProperty("Password"));
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
	}
	
	// Following test case will print all titles of the OrangeHRM application
	@Test(enabled=true)
	public void printOrangeHRMTitles() throws InterruptedException
	{
		/*System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		List<String> titles=new ArrayList<String>();
		driver.get(data.getUrl());
		Thread.sleep(5000);
		titles.add(driver.getTitle());
		driver.findElement(By.id("txtUsername")).sendKeys(data.getUsername());
		driver.findElement(By.id("txtPassword")).sendKeys(data.getPassword());
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		titles.add(driver.getTitle());
		
		for(String title:titles)
		{
			System.out.println("Page Title---"+title);
		}
				
	}
	
	// Following test case will print the current urls of the pages
	@Test(enabled=true)
	public void printCurrentPageUrls() throws InterruptedException
	{
		/*System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		List<String> urls=new ArrayList<String>();
		driver.get(data.getUrl());
	
		urls.add(driver.getCurrentUrl());
		driver.findElement(By.id("txtUsername")).sendKeys(data.getUsername());
		driver.findElement(By.id("txtPassword")).sendKeys(data.getPassword());
		driver.findElement(By.id("btnLogin")).click();
		
		urls.add(driver.getCurrentUrl());
		
		for(String url:urls)
		{
			System.out.println("Page URL---"+url);
		}
	}

	@Test(enabled=true)
	public void printCurrentPageSource() throws InterruptedException
	{
		/*System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		List<String> pageSoureces=new ArrayList<String>();
		driver.get(data.getUrl());
		
		pageSoureces.add(driver.getPageSource());
		driver.findElement(By.id("txtUsername")).sendKeys(data.getUsername());
		driver.findElement(By.id("txtPassword")).sendKeys(data.getPassword());
		driver.findElement(By.id("btnLogin")).click();
		
		pageSoureces.add(driver.getPageSource());
		
		for(String source:pageSoureces)
		{
			System.out.println(source);
		}
	}

}
