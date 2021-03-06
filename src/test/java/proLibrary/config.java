package proLibrary;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(plugin="html: outputt/cuc.html",features="use_cases",glue="proLibrary")
	
	public class config {

		
		
	}