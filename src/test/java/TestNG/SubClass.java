package TestNG;

import org.testng.annotations.Test;

public class SubClass extends SuperClass{

	//for below method protected is not allowed
	/*protected void methodA()
	{
		System.out.println("In super class method A");
	}*/
	//for below method we cannot have private as it is declared as public in super class
	/*private void methodB()
	{
		System.out.println("In sub class method B");
	}*/
	
	public void methodB()
	{
		System.out.println("In sub class method B");
	}
	//We can have public for methodC
	public void methodC()
	{
		System.out.println("In sub class method C");
	}	
	//for below method Private is not allowed
	/*private void methodD()
	{
		
	}*/
	
	@Test
	public void test()
	{
		methodA();
		methodB();
		methodC();
		methodD();
	}

}
