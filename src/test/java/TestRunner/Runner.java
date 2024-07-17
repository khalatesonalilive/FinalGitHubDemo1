package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features= {"AllFeatureFiles"},
		glue= {"Steps"},
		dryRun=false,
		monochrome=true,
		
		plugin= {
				
				"html:Reports/sonali.html",
				"json:Reports/Sonali2.json",
				"junit:Reports/Sonali3.xml",
				"pretty:Reports/Sonali4.txt"},
		
   tags="@Register"
          )
           
public class Runner {

}
