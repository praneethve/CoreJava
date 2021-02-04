package c17;

import java.util.*;
public class JavaExample1{
   public static void main(String args[]){

      LinkedList<String> list=new LinkedList<String>();

      
      list.add("mom");
      list.add("Dad");
      list.add("Son");
      list.add("SIS");
      list.add("Bro");

      
      list.removeFirst();

      
      list.removeLast();

      
      Iterator<String> iterator=list.iterator();
      while(iterator.hasNext()){
         System.out.print(iterator.next()+" ");
      }

      
      list.remove(1);

      System.out.print("\nAfter removing second element: ");
      
      Iterator<String> iterator2=list.iterator();
      while(iterator2.hasNext()){
         System.out.print(iterator2.next()+" ");
      }
   }
}