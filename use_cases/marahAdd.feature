Feature: marahAddbook 




Scenario: Add a book when the administrator is logged in 

	Given The Admin with Username as "marah"  is logged in 
	
	When  The Admin add book with Title as " we begin at the end", Author as "Chris Whaitaker" ,  Signature as "Whaitaker 2001" and ISBN as "1785769626" 
	
	
	Then The book will be added 
	
	
	
	
Scenario: Add a book when the administrator is not logged in 
	Given   The Admin with Username as "marah"  is not logged in 
	 
	When    The Admin add book with Title as " we begin at the end", Author as "Chris Whaitaker" ,  Signature as "Whaitaker 2001" and ISBN as "1785769626" 
	
	Then The book will be not added
	
	
