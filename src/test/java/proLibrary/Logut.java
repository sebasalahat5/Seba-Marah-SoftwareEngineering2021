package proLibrary;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logut {
	ArrayList<Admin> Adminarray = Login.getAdminarray();
	Admin o ;
	@Given("admin is logout with username {string}")
	
	public void admin_is_logout_with_username(String string) {
		
for (int i = 0; i < Adminarray.size(); i++) {
			
			if (Adminarray.get(i).getUsername().compareTo(string) == 0)
				 {
		
				o=Adminarray.get(i);
			
			}
			}
	}

	@When("the admin is login")
	public void the_admin_is_login() {
		o.AdminLogin();
		if (o.Login ==true) {
			o.Login=false;
	
		}
					
	}
	
		

@Then("the admin would be  logged out")
public void the_admin_would_be_logged_out() {
	
	assert(o.Login==false);
	o.messegeout();
	 
}







}
