package cukespackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions (features= "./src/main/java/feature/Login.feature",glue="loginsteps", tags= "@createlead,",monochrome=true)


public class RunCukes {


}
