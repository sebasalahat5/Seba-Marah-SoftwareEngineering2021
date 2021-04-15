Feature: Search book 

	searching for a book from library using substrings from its title, auther name ot ISBN	
Background:
the library has repository of books with their specifications(title,author,ISBN and signature) 
	Given admin with username "marah" is logged out 
	And admin with username "seba" is logged in 
	And  these books are contained in the library 
		|title|author|ISBN|signature|
		|we begin at the end|Chris Whaitaker|1785769626|whaitaker2001|
		|the lost apothecary|sarah penner|0778311015|Penner1989|	
		|tall oaks|Chris Whaitaker|1785770306|whaitaker1999|	
		
		
	
	
	
	
	
		
Scenario Outline: Searching for a substring of the title 

	When admin with username "marah" enters the substring <title> 
	Then book <output> will appeare successfully 
	Examples: 
		|title|output|
		|"we begin at the end"|"we begin at the end"|
		|" lost"|"the lost apothecary"|
		|"oaks"|"tall oaks"|
		
		
		
		
		
		
		
Scenario Outline: Searching for a substring of the author 

	When admin with username "marah" enters the subS <author> 
	Then book <title> will appear successfully 
	Examples: 
		|author|title|
		|"sarah"|"the lost apothecary"|
		|"penner"|"the lost apothecary"|
		|"sarah penner"|"the lost apothecary"|
		
Scenario Outline: Searching for a substring of the ISBN 

	When admin with username "marah" enters the input <isbn> 
	Then book <title> will show successfully 
	Examples: 
		|isbn|title|
		|"0778311015"|"the lost apothecary"|	
		|"1785769626"|"we begin at the end"|	
		|"306"|"tall oaks"|
		
Scenario Outline:
Searching a title also works when the user/administrator is logged in 

	When the Admin with username "seba" enters substring <title> 
	Then book <output> will manifest successfully 
	
	Examples: 
		|title|output|	
		|"tall oaks"|"tall oaks"|
Scenario Outline:
Searching an author also works when the user/administrator is logged in 

	When the admin with username "seba" enters substring <author> 
	Then book <title> will arise successfully 
	
	Examples: 
		|author|title|	
		|"sarah"|"the lost apothecary"|
		
Scenario Outline:
Searching an isbn also works when the user/administrator is logged in 

	When The Admin with username "seba" enters substring <isbn> 
	Then book <title> will reveal successfully 
	
	Examples: 
		|isbn|title|	
		|"1785770306"|"tall oaks"|
		
Scenario Outline: No books match the criteria (title) 

	When the admin enters substring <title> to searching about book 
	Then the book with <output> not appear 
	
	Examples: 
		|title|output|
		|"flower"|"Not Found"|	
		
Scenario Outline: No books match the criteria (author) 

	When the admin enters substring <author> to searching1 about book 
	Then the book with <title> not manifest
	
	Examples: 
		|author|title|	
		|"julia"|"Not Found"|	
		
Scenario Outline: No books match the criteria (isbn) 

	When the admin enters substring <isbn> to searching2 about book 
	Then the book with <title> not reveal 
	
	Examples: 
		|isbn|title|	
		|"1234567891"|"Not Found"|
		
Scenario Outline: Find more than one book for the same substring of title	

When  the Admin enters substring <title>	
Then all book <output> that matches the specifications will appear	

Examples:	
|title|output|
|"the"|"we begin at the end,the lost apothecary"|

Scenario Outline: Find more than one book for the same substring of author	

When admin enters substring <author>	
Then All book <output> that matches the specifications will reveal	

Examples:	
|author|output|
|"Chris"|"we begin at the end,tall oaks"|
		