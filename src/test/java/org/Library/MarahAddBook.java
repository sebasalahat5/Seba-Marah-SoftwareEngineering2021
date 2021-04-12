package org.Library;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

import org.Library.Admin;
import org.Library.Book;
import org.Library.Library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class MarahAddBook {
	String input;
	public boolean book;
	public boolean D;
	public boolean A;
	Book G ;
	Admin k;
	Library ob=new Library();
	ArrayList<Admin> Adminarray = Login.getAdminarray();
	ArrayList<Book> Bookarray = new ArrayList<Book>();
	@Given("The Admin with Username as {string}  is logged in")
	public void the_admin_with_username_as_is_logged_in(String string) {
		System.out.println("Arraysize:"+Adminarray.size());
		for (int i = 0; i < Adminarray.size(); i++) {
			if (Adminarray.get(i).getUsername().compareTo(string) == 0)
				 {
					 Adminarray.get(i).adminLogin();
                     A= Adminarray.get(i).login;
					}}
	}
	@When("The Admin add book with Title as {string}, Author as {string} ,  Signature as {string} and ISBN as {string}")
	public void the_admin_add_book_with_title_as_author_as_signature_as_and_isbn_as(String string, String string2, String string3, String string4) {  
		G=new Book();
		 G.setTitle(string);
		 G.setAuthor(string2);
		 G.setSignature(string3);
		 G.setIsbn(string4);
		 if (A) {
			 System.out.println("after login");
				if(G.isValidISBN(G.getIsbn())) {
					System.out.println("validisbn");
					if( G.isUniqeSig(string3, Bookarray)) {	
						System.out.println("uniq sig");
				        Bookarray.add(G);
					}
					 book=true;
				}
				else {System.out.println("notvalid");
				}
			}				
	}
	@Then("The book will be added")
	public void the_book_will_be_added() {
		assertEquals("true",String.valueOf(book));
		System.out.print("Add Book successfully");
	}
	@Given("The Admin with Username as {string}  is not logged in")
	public void the_admin_with_username_as_is_not_logged_in(String string) {
for (int i = 0; i < Adminarray.size(); i++) {			
			if (Adminarray.get(i).getUsername().equals(string))
				 {	
					D= Adminarray.get(i).getstatc();					
				 if(!D) {
					 book=false;
				 }
				 }}
	}
	@Then("The book will be not added")
	public void the_book_will_be_not_added() {
		assertEquals("false",String.valueOf(book));
	}


	
		

	
}
