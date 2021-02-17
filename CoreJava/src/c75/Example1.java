package c75;


import java.util.Optional; 
public class Example1 { 
 public static void main(String[] args) {    
    String[] str = new String[10];     
    Optional<String> isNull = Optional.ofNullable(str[9]);        
    if(isNull.isPresent()){     
                
       String str2 = str[9].substring(2, 5);          
                
       System.out.print("Substring is: "+ str2);       
    }     
    else{      
       System.out.println("Cannot get the substring from an empty string");     
    }                
    str[9] = "AgraIsCool";       
    Optional<String> isNull2 = Optional.ofNullable(str[9]);       
    if(isNull2.isPresent()){        
              
       String str2 = str[9].substring(2, 5);            
             
       System.out.print("Substring is: "+ str2);          
    }         
    else{         
       System.out.println("Cannot get the substring from an empty string");         
    }    
 }
}