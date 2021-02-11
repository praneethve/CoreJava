package c58;

import java.util.regex.*;  
class RegexExample1{  
   public static void main(String args[]){  
      String content = "This is Praneeth " +
	    "Core Java";

      String pattern = ".*book.*";

      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("The text contains 'book'? " + isMatch);
   }
}  