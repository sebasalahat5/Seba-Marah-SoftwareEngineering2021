Feature: Admin logout 



Scenario: Administrator logs out 
	Given admin is logout with username "marah" 
	When the admin is login 
	Then the admin would be  logged out 
	