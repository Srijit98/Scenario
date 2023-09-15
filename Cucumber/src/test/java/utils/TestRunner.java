package utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = "Features",
	glue = "in.demoShop.tests"
	
)


public class TestRunner extends AbstractTestNGCucumberTests {

	

}
