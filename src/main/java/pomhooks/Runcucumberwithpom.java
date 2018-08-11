package pomhooks;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions (features= "./src/main/java/featurewithcucumber/Login.feature",glue= {"pomhooks","pageswithcucumber"},tags= "@createlead",monochrome=true)


public class Runcucumberwithpom {


}



 