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
	
	public Book setBookFeatures(int i) {
		Book resultTile;
		resultTile = new Book();
		resultTile.setTitle(myLibrary.get(i).getTitle());
		resultTile.setAuthor(myLibrary.get(i).getAuthor());
		resultTile.setIsbn(myLibrary.get(i).getIsbn());
		resultTile.setSignature(myLibrary.get(i).getSignature());
		return resultTile;
	}
	
	public Book searchTitle(String searchFor)
	{
		toPrint.clear();
		Book resultTile = new Book();
		
		for(int i=0; i<myLibrary.size(); i++)
		{
			if(myLibrary.get(i).getTitle().contains(searchFor))
			{
				resultTile = setBookFeatures(i);
				toPrint.add(resultTile);
				found = true;
			}
		}
		if(!found)
		{
			resultTile.setTitle(NOT_FOUND);
			String str = String.format("\"Result of searching about title: \" %s %s",searchFor,NOT_FOUND);
			logger.log(Level.WARNING,str);
		}
		else
		{
			String st = String.format("\"Result of searching about title: \" %s",searchFor);
			logger.log(Level.WARNING,st);
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
				resultAuthor = setBookFeatures(i);
				toPrint.add(resultAuthor);	
				found = true;				
			}
		}	
		if(!found)
		{
			resultAuthor.setTitle(NOT_FOUND);
			String strAuthor = String.format("\"Result of searching about author: \" %s %s",searchFor,NOT_FOUND);
			logger.log(Level.WARNING,strAuthor);
			
		}
		else
		{
			String stAuthor = String.format("\"Result of searching about author: \" %s",searchFor);
			logger.log(Level.WARNING,stAuthor);
			
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
				resultIsbn = setBookFeatures(i);
				toPrint.add(resultIsbn);
				found = true;
			}
		}
		if(!found)
		{
			resultIsbn.setTitle(NOT_FOUND);
			String strIsbn = String.format("\"Result of searching about isbn: \" %s %s",searchFor,NOT_FOUND);
			logger.log(Level.WARNING,strIsbn);
			
		}
		else
		{
			String stIsbn = String.format("\"Result of searching about isbn: \" %s",searchFor);
			logger.log(Level.WARNING,stIsbn);
			printOutput();
		}
		return resultIsbn;
	}
	public void printOutput()
	{
		if(toPrint.isEmpty())
			logger.log(Level.WARNING,NOT_FOUND);
		else
		{
			for(int p=1; p<= toPrint.size(); p++)
			{
				String result = String.format("Title: %s Author: %s ISBN: %s Signature: %s",
						toPrint.get(p-1).getTitle(),toPrint.get(p-1).getAuthor(),
						toPrint.get(p-1).getIsbn(),toPrint.get(p-1).getSignature());
				
				logger.log(Level.WARNING,result);
				
				
			}
		}
	}
}