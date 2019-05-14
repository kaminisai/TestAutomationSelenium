package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//defining the location for the login.feature 
@CucumberOptions(features = "C:\\Users\\hp\\eclipse\\TestAutomationSelenium\\src\\main\\java\\feature\\login.feature", glue = {
		"stepDefinition" })
public class ConferenceRunner {

}
