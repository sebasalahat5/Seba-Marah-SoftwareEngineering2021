package proLibrary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



	public class searchbook {
		Book b1;
		Book q;
		public String username1 = "marah";
		public String username2 = "seba";
		public Library searchLibrary = new Library();
		
		@Given("admin with username {string} is logged out")
		public void admin_with_username_is_logged_out(String string) {
			string = username1;
		}

		@Given("admin with username {string} is logged in")
		public void admin_with_username_is_logged_in(String string) {
			string = username2;
		}

		@Given("these books are contained in the library")
		public void these_books_are_contained_in_the_library(List<List> bookLibrary)
		{
			for(int i=0; i<bookLibrary.size();i++)
			{
			  b1 = new Book();
			  b1.setTitle(bookLibrary.get(i).get(0).toString());
			  b1.setAuthor(bookLibrary.get(i).get(1).toString());
			  b1.setIsbn(bookLibrary.get(i).get(2).toString());
			  b1.setSignature(bookLibrary.get(i).get(3).toString());
			  searchLibrary.myLibrary.add(b1);
			
			}
		   
		}

		@When("admin with username {string} enters the substring {string}")
		public void admin_with_username_enters_the_substring(String string, String string2) {
			 q= searchLibrary.SearchTitle(string2);
		}

		@Then("book {string} will appeare successfully")
		public void book_will_appeare_successfully(String string) {
			assertEquals(string,q.getTitle());
			  
		}

		@When("admin with username {string} enters the subS {string}")
		public void admin_with_username_enters_the_sub_s(String string, String string2) {
			 q= searchLibrary.SearchAuthor(string2);
		}

		@Then("book {string} will appear successfully")
		public void book_will_appear_successfully(String string) {
			assertEquals(string,q.getTitle());
			  
		}
		@When("admin with username {string} enters the input {string}")
		public void admin_with_username_enters_the_input(String string, String string2) {
			 q= searchLibrary.SearchISBN(string2);
		}

		@Then("book {string} will show successfully")
		public void book_will_show_successfully(String string) {
			assertEquals(string,q.getTitle());
		}
	
		@When("the Admin with username {string} enters substring {string}")
		public void the_admin_with_username_enters_substring(String string, String string2) {
			 q= searchLibrary.SearchTitle(string2);
		}

		@Then("book {string} will manifest successfully")
		public void book_will_manifest_successfully(String string) {
			assertEquals(string,q.getTitle());
		}
		@When("the admin with username {string} enters substring {string}")
		public void the_admin_with_username_enters_substring1(String string, String string2) {
			 q= searchLibrary.SearchAuthor(string2);
		}

		@Then("book {string} will arise successfully")
		public void book_will_arise_successfully(String string) {
			assertEquals(string,q.getTitle());
		}
		@When("The Admin with username {string} enters substring {string}")
		public void the_admin_with_username_enters_substring2(String string, String string2) {
			 q= searchLibrary.SearchISBN(string2);
		}

		@Then("book {string} will reveal successfully")
		public void book_will_reveal_successfully(String string) {
			assertEquals(string,q.getTitle());
		}
		
		@When("the admin enters substring {string} to searching about book")
		public void the_admin_enters_substring_to_searching_about_book(String string) {
			q= searchLibrary.SearchTitle(string);
		}

		@Then("the book with {string} not appear")
		public void the_book_with_not_appear(String string) {
			assertEquals(string,q.getTitle());
		}

		@When("the admin enters substring {string} to searching1 about book")
		public void the_admin_enters_substring_to_searching1_about_book(String string) {
			q= searchLibrary.SearchAuthor(string);
		}

		@Then("the book with {string} not manifest")
		public void the_book_with_not_manifest(String string) {
			
			assertEquals(string,q.getTitle());
		}

		
		@When("the admin enters substring {string} to searching2 about book")
		public void the_admin_enters_substring_to_searching2_about_book(String string) {
			q= searchLibrary.SearchISBN(string);
		}

		@Then("the book with {string} not reveal")
		public void the_book_with_not_reveal(String string) {
			assertEquals(string,q.getTitle());
		}
		@When("the Admin enters substring {string}")
		public void the_admin_enters_substring(String string) {
			q=searchLibrary.SearchTitle(string); 
		}

		@Then("all book {string} that matches the specifications will appear")
		public void all_book_that_matches_the_specifications_will_appear(String string) {
			String[] ex ;
			ex=string.split(",");
			for(int i=0; i<searchLibrary.toPrint.size(); i++)
			{
				assertEquals(ex[i],searchLibrary.toPrint.get(i).getTitle());
			}
			
			}

		@When("admin enters substring {string}")
		public void admin_enters_substring(String string) {
			searchLibrary.SearchAuthor(string); 
		}

		@Then("All book {string} that matches the specifications will reveal")
		public void all_book_that_matches_the_specifications_will_reveal(String string)
		{
			String[] ex ;
			ex=string.split(",");
			for(int i=0; i<searchLibrary.toPrint.size(); i++)
			{
				assertEquals(ex[i],searchLibrary.toPrint.get(i).getTitle());
			}
			
			}

			
		}
		



		
		
		
		
		
		
		
		
		
		
		


