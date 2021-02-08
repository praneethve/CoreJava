package c55;

import java.util.ArrayList;  
import java.util.Collections;
public class SortingPgm{     
   public static void main(String args[]){    
      
     ArrayList<Author> al=new ArrayList<Author>();        
     al.add(new Author("Praneeth", "Titanic",  22));
     al.add(new Author("Avinash", "The Secrete", 23));
     al.add(new Author("Yeswanth", "300", 20));
     al.add(new Author("Krishna", " Gita", 22));
     al.add(new Author("Manirathnam", "Fast & Furis", 25));
       
     System.out.println("Sorting by Author First Name:");      
     Collections.sort(al);        
     for(Author au: al){       
       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
           au.getAuAge());        
     } 
          
     System.out.println("Sorting by Author Age:");
     Collections.sort(al, new AuthorAgeComparator());
     for(Author au: al){       
       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
          au.getAuAge());        
     }             
         
     System.out.println("Sorting by Book Name:");      
     Collections.sort(al, new BookNameComparator());      
     for(Author au: al){       
        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
           au.getAuAge());       
     }    
  }  
}  
