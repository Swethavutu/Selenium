package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions("features="src\test\resources\Feature1"),
glue={"TestRunner"},
monochrome=true,
plugin={



public class Testrunner1 {

}
