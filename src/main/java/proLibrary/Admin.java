package proLibrary;

import java.util.ArrayList;

public class Admin {
	
	private String Adminname;
	private	String Adminpass;
	
	
	
		
		
	public String getUsername()
    {
        return Adminname;
    }

	 public String getPassword()
	    {
	        return Adminpass;
	    }

	 public void setUsername(String AdminName)
	    {
	        this.Adminname = AdminName;
	    }

	    public void setPassword(String Pass)
	    {
	        this.Adminpass = Pass;
	    }
	    public Admin() {
	    	
	    }
	 
	    public void messege() {
			System.out.println("login successfully");
		}
	    
	    public void messege2() {
			System.out.println("login fail");
		} 
	    
	    public static boolean Login ;  
	    //public static boolean b ;  
	    public void AdminLogin() {
	        Login=true;
	      }
	   /* public void AdminLogout() {
	        Login=false;
	      }*/
	    
}
