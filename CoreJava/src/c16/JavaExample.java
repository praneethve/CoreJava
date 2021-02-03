package c16;

import java.util.*;  
class JavaExample{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("ME");
      alist.add("Dad");
      alist.add("Mom");
      alist.add("Father in law");
      alist.add("Mother in law");
      alist.add("Grand Father");
       System.out.println(alist);
      alist.add(3, "Mom");
       System.out.println(alist);
   }  
}
