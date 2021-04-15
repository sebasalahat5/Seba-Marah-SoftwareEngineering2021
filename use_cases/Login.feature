Feature: Admin login 

Scenario: Administrator can log in with valid credentials 
	Given The Admin Username as "marah" and Password as "123" 
	
	
	When  The Admin enters Username as "marah" and Password as "123" 
	
	Then   The password should be "123" and The Admin  is able to successfully login 
	
	
	
	
	
	
Scenario: Administrator has the wrong password 
	Given The Admin Username as "seba" and Password as "654" 
	
	When  The Admin enters Username as "seba" and wrongPassword as "875" 
	
	Then   The Admin  is not able to successfully login because  "Password" wrong
	