package proLibrary;
import java.util.ArrayList;
public class Book {
	private String title;
	private String author;
	private String isbn;
	private String signature;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	static boolean isValidISBN(String isbn) 
    { 
       
        int n = isbn.length(); 
        if (n != 10) 
            return false; 
 
        int sum = 0; 
        for (int i = 0; i < 9; i++)  
        { 
            int digit = isbn.charAt(i) - '0'; 
            if (0 > digit || 9 < digit) 
                return false; 
            sum += (digit * (10 - i)); 
        } 
  
         
        char last = isbn.charAt(9); 
        if (last != 'X' && (last < '0' ||  
                            last > '9')) 
            return false; 
  
        sum += ((last == 'X') ? 10 : (last - '0')); 
  
        return (sum % 11 == 0); 
    }

	static boolean isUniqeSig(String Sig,ArrayList <Book> v) {
		boolean w =true ;
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getSignature().equals(Sig)) {
				w=false;
			}
			else w=true;
			
		}
		
		
		
		
		return w;
		
	
	}
  

} 
  



