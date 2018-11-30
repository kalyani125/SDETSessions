package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features = { "src\\test\\java\\CucumbertTest" },
		
	//features = { "src\\test\\java\\CucumbertTest\\Scenarios.feature" },
	//	glue= {"src\\test\\java\\CucumberTest\\Stepdefinition.java"},
		glue= {"src\\test\\java\\CucumberTest\\StepdefinitionforQ5andQ6.java"},
		format= {"pretty","html:target/cucumber"},
		//tags= {"@SmokeTest1,@Multiplication,@logintowordpresssite"},
		tags= {"@Multiplication"}
		)

public class TestRunner {

}
