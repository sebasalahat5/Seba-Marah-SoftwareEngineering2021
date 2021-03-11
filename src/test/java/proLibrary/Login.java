package proLibrary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
		MarahAddBook t=new MarahAddBook();
	public static ArrayList<Admin> getAdminarray() {
	      return Adminarray;
	   }

	Admin f;

public	 static ArrayList<Admin> Adminarray = new ArrayList<Admin>();
	
	@Given("The Admin Username as {string} and Password as {string}")
	public void the_admin_username_as_and_password_as(String string, String string2) {
		
		f=new Admin();
		f.setUsername(string);
		f.setPassword(string2);
		Adminarray.add(f);}
		


@When("The Admin enters Username as {string} and Password as {string}")
	public void the_admin_enters_username_as_and_password_as(String string, String string2) {
		for (int i = 0; i < Adminarray.size(); i++) {
		
			if (Adminarray.get(i).getUsername().compareTo(string) == 0
					&& Adminarray.get(i).getPassword().compareTo(string2) == 0) {
				
				f.messege();
			}
			}
		}  
	

	@Then("The password should be {string} and The Admin  is able to successfully login")
	public void the_password_should_be_and_the_admin_is_able_to_successfully_login(String string) {
		assertEquals(f.getPassword(), string);
		f.AdminLogin();
		
	}

	@When("The Admin enters Username as {string} and wrongPassword as {string}")
	public void the_admin_enters_username_as_and_wrong_password_as(String string, String string2) {
		for (int i = 0; i < Adminarray.size(); i++) {
			
			if (Adminarray.get(i).getUsername().compareTo(string) == 0
					&&Adminarray.get(i).getPassword().compareTo(string2) == 1) {
				f.messege2();
			}
			}
		}
	

	@Then("The Admin  is not able to successfully login because  {string} wrong")
	public void the_admin_is_not_able_to_successfully_login_because_wrong(String string) {
		assertNotEquals(f.getPassword(),string);
	}

	
}

