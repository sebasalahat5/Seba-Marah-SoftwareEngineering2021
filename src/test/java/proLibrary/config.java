package proLibrary;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(plugin="html: output/cuco.html",features="use_cases",glue="proLibrary")
	//@Cucumber.Options(features= {"Login.feature","AddBOOK.feature","Logout.feature"})
	
	public class config {

		
		
	}