package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features ="src/test/java/CucumberFeatureFile/Feature1.feature",glue= {"Steps","pageObjectModelTests"}, monochrome=true)
@RunWith(Cucumber.class)
public class CreateLeadRunner {
	
	

}
