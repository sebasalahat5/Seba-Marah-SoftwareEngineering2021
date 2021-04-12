package org.Library;
public class Admin {
	
	private String AdminName;
	private	String admin_pass;	
	
	public String getUsername()
    {
        return AdminName;
    }
	

	 public String getPassword()
	    {
	        return admin_pass;
	    
	    
	    }

	 public void setUsername(String admin_name)
	    {
	        this.AdminName = admin_name;
	    }

	    public void setPassword(String pass)
	    {
	        this.admin_pass = pass;
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
	   
	    public void adminLogin() {
	        login=true;
	       
	      }
	  
	   
}
