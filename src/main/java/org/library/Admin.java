package org.library;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin {
	static Logger logger = Logger.getLogger(Admin.class.getName());
	
	private String adminName;
	private	String adminPass;	
	
	public String getUsername()
    {
        return adminName;
    }
	

	 public String getPassword()
	    {
	        return adminPass;
	    
	    
	    }

	 public void setUsername(String adminName)
	    {
	        this.adminName = adminName;
	    }

	    public void setPassword(String pass)
	    {
	        this.adminPass = pass;
	    }
	    
	    public void messege() {
	    	
			logger.log( Level.WARNING, "login successfully");
			
		}
	    
	    public void messege2() {
	    	logger.log( Level.WARNING,"login fail");
		} 
	    public void messegeout() {
	    	logger.log( Level.WARNING,"logout successfully");
		}
	    
	    static boolean login;
	    
	    public boolean getstatc() {
	    	
	    	return login;
	    }
	   
	    public static void adminLogin() {
	        login=true;
	       
	      }
	  
	   
}