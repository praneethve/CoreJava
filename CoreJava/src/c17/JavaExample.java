package c17;

import java.util.*;
public class JavaExample{
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();


     list.add("MOM");
     list.add("DAD");
     list.add("SIS");
      list.addFirst("BRO");

  
     list.addLast("SON");

  
     list.add(2, "PC");

       Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
     }
   } 
} 
