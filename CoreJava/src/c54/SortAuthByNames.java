package c54;

import java.util.ArrayList;   
import java.util.Collections;
public class SortAuthByNames{  
   public static void main(String args[]){  
      
      ArrayList<Author> al=new ArrayList<Author>(); 
      al.add(new Author("Praneeth","Venulapalli", "Tropic of Cancer"));  
      al.add(new Author("Kolli","Avinash", "Brown Girl in the Ring"));
      al.add(new Author("Yeswanth","Maram", "300"));
      al.add(new Author("Nulli","Maniratham", "Sky Boys"));
      al.add(new Author("Gopal","Krishna", "Song of Ice and Fire"));
      
      
      Collections.sort(al);  
      for(Author str:al){  
    	  System.out.println(str.firstName+" "+
          str.lastName+" "+"Book: "+str.bookName);  
      } 
   }  
}  
