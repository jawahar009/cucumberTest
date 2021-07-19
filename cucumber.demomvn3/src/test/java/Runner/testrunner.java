package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Login"},
glue= {"stepdefination"},
monochrome =true,
plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
// to make a console output in better format we are using monochrome
		)

public class testrunner {
}
