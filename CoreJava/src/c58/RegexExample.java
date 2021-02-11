package c58;

import java.util.regex.*;  
class RegexExample{  
public static void main(String args[]){  
   
   System.out.println(Pattern.matches("tom", "Tom")); 
	
  
   System.out.println(Pattern.matches("[Tt]om", "Tom")); 
   System.out.println(Pattern.matches("[Tt]om", "Tom"));   
   System.out.println(Pattern.matches("[tT]im|[jJ]in", "Tim"));
   System.out.println(Pattern.matches("[tT]im|[jJ]in", "jin"));
	
  
   System.out.println(Pattern.matches(".*abc.*", "deabcpq"));
	
  
   System.out.println(Pattern.matches("^[^\\d].*", "123abc")); 
   System.out.println(Pattern.matches("^[^\\d].*", "abc123")); 
	
   
   System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));
   System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));
   System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "apZx"));
	
   
   System.out.println(Pattern.matches("\\D*", "abcde")); 
   System.out.println(Pattern.matches("\\D*", "abcde123")); 
   System.out.println(Pattern.matches("^This$", "This is Chaitanya")); 
   System.out.println(Pattern.matches("^This$", "This")); 
   System.out.println(Pattern.matches("^This$", "Is This Chaitanya")); 
}
}