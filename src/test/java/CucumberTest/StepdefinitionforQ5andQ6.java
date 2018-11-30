package CucumberTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import AssignmentQuestion1.DemoSiteLoginPage;
import OranglivehomePages_Question1.DirectoryPage;
import OranglivehomePages_Question1.OrangeHRMHomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefinitionforQ5andQ6 {
	
	WebDriver driver;
	int result=0;
	List<Integer> numbers=new ArrayList<Integer>();
	DirectoryPage dirPage=new DirectoryPage(driver);
	OrangeHRMHomePage homePage=new OrangeHRMHomePage(driver);

	@Given("^a list of numbers$")
	public void a_list_of_numbers(List<Integer> numbers) throws Throwable {
	   this.numbers=numbers;
	}

	@Then("^I should get (\\d+)$")
	public void i_should_get(int arg1) throws Throwable {
	    Assert.assertEquals(arg1, result);
	}
	
	@When("^I Multiply them$")
	public void i_Multiply_them() throws Throwable {
		int k=1;
		 for(int num: numbers)
		    {
		    	k=k*num;
		    }
		 result=k;
	}

	
	@Given("^I open my wordpress application$")
	public void i_open_my_wordpress_application() throws Throwable {
		 System.out.println("**In I open my application");
		    
		   /* System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();*/
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demosite.center/wordpress/wp-login.php");
	}

	@Given("^I login with following credentials into the application$")
	public void i_login_with_following_credentials_into_the_application(DataTable table) throws Throwable {
 System.out.println("**In I login with following credentials");
		 
		 List<String> list=table.asList(String.class);
		 System.out.println("*Username - "+list.get(0));
		 System.out.println("*Password - "+list.get(1));
		 DemoSiteLoginPage login=new DemoSiteLoginPage(driver);
	   login.enterUsername(list.get(0));
	   login.enterPassword(list.get(1));
	   login.clickLoginButton();
	}

	@Given("^I validate the page title$")
	public void i_validate_the_page_title(DataTable table) throws Throwable {
		Thread.sleep(15000);
		List<String> list=table.asList(String.class);
		String title=driver.getTitle();
		   Assert.assertEquals(list.get(0),title);
		   
	}



}
