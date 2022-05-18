package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {".//src//main//java//Features" }
		,glue = {"stepDefination"}
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
		,publish = true
		,tags =  "@Test"
		)
public class Runner extends AbstractTestNGCucumberTests {

}


