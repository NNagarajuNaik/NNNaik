package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features="FeatureFile",
                 glue="stepDefination",
                 dryRun=false,
                 monochrome=true,
                 format={"html:target/reports"}
                 )
public class Runner {

}
