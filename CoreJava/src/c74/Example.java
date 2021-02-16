package c74;

import java.util.StringJoiner;  
public class Example {  
    public static void main(String[] args) {  
    	
        StringJoiner mystring = new StringJoiner("-");    
          
        
        mystring.add("Avinash");  
        mystring.add("Yeswanth");  
        mystring.add("Krishna");  
        mystring.add("Praneeth");  
      
        System.out.println(mystring);  
    }  
}