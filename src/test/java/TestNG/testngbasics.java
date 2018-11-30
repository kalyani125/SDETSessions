package TestNG;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportingListners.class)
public class testngbasics {
	
	@BeforeSuite
	public void beforesuite(){
		System.out.println("--before suite--");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest(){
		System.out.println("--before Test--");
	}

	@Test(priority=1)
	public void TestMethod1()
	{
		System.out.println("- Test Method1--");
	}
		
	@Test(priority=2)
	public void TestMethod2()
	{
		System.out.println("- Test Method2--");
		Assert.fail();
	}
	@Test(priority=3,dependsOnMethods= ("TestMethod2"))
	public void TestMethod3()
	{
		System.out.println("- Test Method3--");
	}
	@AfterTest
	public void AfterTestMethods(){
		System.out.println("--After Test--");
	}
	
}
