package org.library;
public class Admin {
	
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

	 public void setUsername(String admin_name)
	    {
	        this.adminName = admin_name;
	    }

	    public void setPassword(String pass)
	    {
	        this.adminPass = pass;
	    }
	    public Admin() {
	    	
	    }
	 
	    public void messege() {
			System.out.println("login successfully");
		}
	    
	    public void messege2() {
			System.out.println("login fail");
		} 
	    public void messegeout() {
			System.out.println("logout successfully");
		}
	    
	    public  static boolean login;
	    
	    public boolean getstatc() {
	    	
	    	return login;
	    }
	   
	    public static void adminLogin() {
	        login=true;
	       
	      }
	  
	   
}