package org.library;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Library
{
	static Logger logger = Logger.getLogger(Library.class.getName());
	List<Book> myLibrary = new ArrayList <Book>();
	List<Book> toPrint = new ArrayList <Book>();
   
    String [] inputString ;
    String username;
	boolean isbnExist = false;
	boolean found = false;
	private static final String NOT_FOUND = "Not Found";
	
	public Book searchTitle(String searchFor)
	{
		toPrint.clear();
		Book resultTile = new Book();
		
		for(int i=0; i<myLibrary.size(); i++)
		{
			if(myLibrary.get(i).getTitle().contains(searchFor))
			{
				resultTile = new Book();
				resultTile.setTitle(myLibrary.get(i).getTitle());
				resultTile.setAuthor(myLibrary.get(i).getAuthor());
				resultTile.setIsbn(myLibrary.get(i).getIsbn());
				resultTile.setSignature(myLibrary.get(i).getSignature());
				toPrint.add(resultTile);
				found = true;
			}
		}
		if(!found)
		{
			resultTile.setTitle(NOT_FOUND);
			System.out.println("Result of searching about title: "+searchFor+NOT_FOUND);
		}
		else
		{
			System.out.print("Result of searching about title    "+searchFor+": ");
			printOutput();
		}
		return resultTile;
	}
	public Book searchAuthor(String searchFor)
	{
		toPrint.clear();	
		Book resultAuthor= new Book();
		for(int i=0; i<myLibrary.size(); i++)
		{
			if(myLibrary.get(i).getAuthor().contains(searchFor))
			{
				resultAuthor = new Book();
				resultAuthor.setTitle(myLibrary.get(i).getTitle());
				resultAuthor.setAuthor(myLibrary.get(i).getAuthor());
				resultAuthor.setIsbn(myLibrary.get(i).getIsbn());
				resultAuthor.setSignature(myLibrary.get(i).getSignature());
				toPrint.add(resultAuthor);	
				found = true;				
			}
		}	
		if(!found)
		{
			resultAuthor.setTitle(NOT_FOUND);
			System.out.println("Result of searching about author:  "+searchFor+NOT_FOUND);
		}
		else
		{
			System.out.print("Result of searching about author    "+searchFor+":  ");
			printOutput();
		}
		return resultAuthor;
	}
	public Book searchIsbn(String searchFor)
	{
		toPrint.clear();
		Book resultIsbn = new Book();
		for(int i=0; i<myLibrary.size(); i++)
		{
			if(myLibrary.get(i).getIsbn().contains(searchFor))
			{
				resultIsbn = new Book();
				resultIsbn.setTitle(myLibrary.get(i).getTitle());
				resultIsbn.setAuthor(myLibrary.get(i).getAuthor());
				resultIsbn.setIsbn(myLibrary.get(i).getIsbn());
				resultIsbn.setSignature(myLibrary.get(i).getSignature());
				toPrint.add(resultIsbn);
				found = true;
			}
		}
		if(!found)
		{
			resultIsbn.setTitle(NOT_FOUND);
			System.out.println("Result of searching about ISBN:   "+searchFor+NOT_FOUND);
		}
		else
		{
			System.out.println("Result of searching about ISBN   "+searchFor+":  ");
			printOutput();
		}
		return resultIsbn;
	}
	public void printOutput()
	{
		if(toPrint.isEmpty())
			System.out.println(NOT_FOUND);
		else
		{
			for(int p=1; p<= toPrint.size(); p++)
			{
				logger.log(Level.WARNING,"Title:  "+toPrint.get(p-1).getTitle()+"  Author:  "+toPrint.get(p-1).getAuthor()+
						"  ISBN:  "+toPrint.get(p-1).getIsbn()+"  Signtaure:  "+toPrint.get(p-1).getSignature());			
			}
		}
	}
}