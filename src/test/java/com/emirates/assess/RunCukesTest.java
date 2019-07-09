package com.emirates.assess;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
			 "pretty", "html:target/cucumberHtmlReport",
		     "html:target/cucumberHtmlReport",     //  for html result
			 "pretty:target/cucumber-json-report.json"   // for json result
		     }
		,features = "src/test/resources"
		,glue = {""}   // predefined step definitions package
		,tags= {"@flightsearch"}
		,dryRun=false
		,monochrome = true		)

public class RunCukesTest { 	
}
