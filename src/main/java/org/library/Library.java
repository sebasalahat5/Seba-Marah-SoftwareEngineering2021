package org.library;
import java.util.*;

public class Library
{
	List<Book> myLibrary = new ArrayList <Book>();
	List<Book> toPrint = new ArrayList <Book>();
   
    String [] inputString ;
    String username;
	boolean isbnExist = false;
	boolean found = false;
	
	
	public Book searchTitle(String searchFor)
	{
		toPrint.clear();
		Book result = new Book();
		
		for(int i=0; i<myLibrary.size(); i++)
		{
			if(myLibrary.get(i).getTitle().contains(searchFor))
			{
				result = new Book();
				result.setTitle(myLibrary.get(i).getTitle());
				result.setAuthor(myLibrary.get(i).getAuthor());
				result.setIsbn(myLibrary.get(i).getIsbn());
				result.setSignature(myLibrary.get(i).getSignature());
				toPrint.add(result);
				found = true;
			}
		}
		if(!found)
		{
			result.setTitle("Not Found");
			System.out.println("Result of searching about title: "+searchFor+" Not Found");
		}
		else
		{
			System.out.print("Result of searching about title    "+searchFor+": ");
			printOutput();
		}
		return result;
	}
	public Book searchAuthor(String searchFor)
	{
		toPrint.clear();	
		Book result= new Book();
		for(int i=0; i<myLibrary.size(); i++)
		{
			if(myLibrary.get(i).getAuthor().contains(searchFor))
			{
				result = new Book();
				result.setTitle(myLibrary.get(i).getTitle());
				result.setAuthor(myLibrary.get(i).getAuthor());
				result.setIsbn(myLibrary.get(i).getIsbn());
				result.setSignature(myLibrary.get(i).getSignature());
				toPrint.add(result);	
				found = true;				
			}
		}	
		if(!found)
		{
			result.setTitle("Not Found");
			System.out.println("Result of searching about author:  "+searchFor+" Not Found");
		}
		else
		{
			System.out.print("Result of searching about author    "+searchFor+":  ");
			printOutput();
		}
		return result;
	}
	public Book searchIsbn(String searchFor)
	{
		toPrint.clear();
		Book result = new Book();
		for(int i=0; i<myLibrary.size(); i++)
		{
			if(myLibrary.get(i).getIsbn().contains(searchFor))
			{
				result = new Book();
				result.setTitle(myLibrary.get(i).getTitle());
				result.setAuthor(myLibrary.get(i).getAuthor());
				result.setIsbn(myLibrary.get(i).getIsbn());
				result.setSignature(myLibrary.get(i).getSignature());
				toPrint.add(result);
				found = true;
			}
		}
		if(!found)
		{
			result.setTitle("Not Found");
			System.out.println("Result of searching about ISBN:   "+searchFor+" Not Found");
		}
		else
		{
			System.out.println("Result of searching about ISBN   "+searchFor+":  ");
			printOutput();
		}
		return result;
	}
	public void printOutput()
	{
		if(toPrint.isEmpty())
			System.out.println("Not Found");
		else
		{
			for(int p=1; p<= toPrint.size(); p++)
			{
				System.out.println("Title:  "+toPrint.get(p-1).getTitle()+"  Author:  "+toPrint.get(p-1).getAuthor()+
						"  ISBN:  "+toPrint.get(p-1).getIsbn()+"  Signtaure:  "+toPrint.get(p-1).getSignature());			
			}
		}
	}
}